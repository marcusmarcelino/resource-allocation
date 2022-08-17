package br.com.resourceallocation.rest.modules.project.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.resourceallocation.rest.modules.project.entities.Project;
import br.com.resourceallocation.rest.modules.project.repositories.PropojectJPARepository;

@Service
public class CreateProjectService {
  @Autowired
  private PropojectJPARepository repository;

  public Project execute(Project project) {
    Project existProject = repository.findByName(project.getName());

    if (existProject != null) {
      throw new Error("Project Already exists!");
    }

    return repository.save(project);
  }
}
