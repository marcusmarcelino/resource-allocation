package br.com.resourceallocation.rest.modules.collaborator.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.resourceallocation.rest.modules.collaborator.entities.Collaborator;
import br.com.resourceallocation.rest.modules.collaborator.repositories.CollaboratorJPARepository;

@Service
public class CreateCollaboratorService {
  @Autowired
  private CollaboratorJPARepository repository;

  public Collaborator execute(Collaborator collaborator) {
    Collaborator existCollaborator = repository.findByName(collaborator.getName());

    if (existCollaborator != null) {
      throw new Error("Employe already exists!");
    }

    return repository.save(collaborator);
  }
}
