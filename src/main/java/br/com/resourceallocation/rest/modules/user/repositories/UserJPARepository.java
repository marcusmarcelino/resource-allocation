package br.com.resourceallocation.rest.modules.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.resourceallocation.rest.modules.user.entities.User;

public interface UserJPARepository extends JpaRepository<User, Long> {

  User findByUsername(String username);

  @Query("SELECT u FROM User u JOIN FETCH u.roles WHERE u.username = :username ")
  User findByUsernameFetchRoles(@Param("username") String username);

}
