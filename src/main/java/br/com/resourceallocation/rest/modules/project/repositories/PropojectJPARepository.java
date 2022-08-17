package br.com.resourceallocation.rest.modules.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.resourceallocation.rest.modules.project.entities.Project;

public interface PropojectJPARepository extends JpaRepository<Project, Long> {
  Project findByName(String name);
}
