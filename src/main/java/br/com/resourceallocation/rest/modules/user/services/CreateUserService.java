package br.com.resourceallocation.rest.modules.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.resourceallocation.rest.modules.user.entities.User;
import br.com.resourceallocation.rest.modules.user.repositories.UserJPARepository;

@Transactional
@Service
public class CreateUserService {

  @Autowired
  UserJPARepository userRepository;

  private BCryptPasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder();
  }

  @Transactional(rollbackFor = Error.class)
  public User execute(User user) {

    User existsUser = userRepository.findByUsername(user.getUsername());

    if (existsUser != null) {
      throw new Error("User already exists!");
    }

    user.setPassword(passwordEncoder().encode(user.getPassword()));

    User createdUser = userRepository.save(user);

    return createdUser;
  }

}
