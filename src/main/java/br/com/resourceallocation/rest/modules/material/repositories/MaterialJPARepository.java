package br.com.resourceallocation.rest.modules.material.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.resourceallocation.rest.modules.material.entities.Material;

public interface MaterialJPARepository extends JpaRepository<Material, Long> {
  Material findByDescription(String description);
}
