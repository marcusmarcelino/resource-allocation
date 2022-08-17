package br.com.resourceallocation.rest.modules.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.resourceallocation.rest.modules.user.entities.Role;

public interface RoleJPARepository extends JpaRepository<Role, Long> {
  Role findByName(String name);
}
