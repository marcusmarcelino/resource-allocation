package br.com.resourceallocation.rest.modules.user.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.resourceallocation.rest.modules.user.repositories.RoleJPARepository;
import br.com.resourceallocation.rest.modules.user.entities.Role;

@Service
public class CreateRoleService {
  @Autowired
  private RoleJPARepository repository;

  public Role execute(Role role) {
    Role existRole = repository.findByName(role.getName());

    if (existRole != null) {
      throw new Error("Role already exists!");
    }

    return repository.save(role);
  }
}
