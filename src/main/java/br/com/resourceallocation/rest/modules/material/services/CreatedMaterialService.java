package br.com.resourceallocation.rest.modules.material.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.resourceallocation.rest.modules.material.entities.Material;
import br.com.resourceallocation.rest.modules.material.repositories.MaterialJPARepository;

@Service
public class CreatedMaterialService {
  @Autowired
  private MaterialJPARepository repository;

  public Material execute(Material material) {
    Material existMaterial = repository.findByDescription(material.getDescription());
    if (existMaterial != null) {
      throw new Error("Material already exists!");
    }
    return repository.save(material);
  }
}
