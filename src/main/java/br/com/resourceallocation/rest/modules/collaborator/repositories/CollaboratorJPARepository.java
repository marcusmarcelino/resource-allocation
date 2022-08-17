package br.com.resourceallocation.rest.modules.collaborator.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.resourceallocation.rest.modules.collaborator.entities.Collaborator;

public interface CollaboratorJPARepository extends JpaRepository<Collaborator, Long> {
  Collaborator findByName(String name);
}
