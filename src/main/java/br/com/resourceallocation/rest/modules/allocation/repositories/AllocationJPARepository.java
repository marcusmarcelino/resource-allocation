package br.com.resourceallocation.rest.modules.allocation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.resourceallocation.rest.modules.allocation.entities.Allocation;
import br.com.resourceallocation.rest.modules.allocation.entities.AllocationId;

public interface AllocationJPARepository extends JpaRepository<Allocation, AllocationId> {
}
