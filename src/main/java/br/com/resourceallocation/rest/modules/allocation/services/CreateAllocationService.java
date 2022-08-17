package br.com.resourceallocation.rest.modules.allocation.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.resourceallocation.rest.modules.allocation.entities.Allocation;
import br.com.resourceallocation.rest.modules.allocation.repositories.AllocationJPARepository;

@Service
public class CreateAllocationService {
  @Autowired
  private AllocationJPARepository repository;

  public Allocation execute(Allocation allocation) {
    return repository.save(allocation);
  }
}
