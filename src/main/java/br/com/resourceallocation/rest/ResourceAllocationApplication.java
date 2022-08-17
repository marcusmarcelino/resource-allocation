package br.com.resourceallocation.rest;

import java.time.LocalDateTime;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.resourceallocation.rest.modules.allocation.entities.Allocation;
import br.com.resourceallocation.rest.modules.allocation.entities.AllocationId;
import br.com.resourceallocation.rest.modules.allocation.services.CreateAllocationService;
import br.com.resourceallocation.rest.modules.collaborator.entities.Collaborator;
import br.com.resourceallocation.rest.modules.collaborator.services.CreateCollaboratorService;
import br.com.resourceallocation.rest.modules.project.entities.Project;
import br.com.resourceallocation.rest.modules.project.services.CreateProjectService;
import br.com.resourceallocation.rest.modules.user.entities.Role;
import br.com.resourceallocation.rest.modules.user.services.CreateRoleService;

@SpringBootApplication
public class ResourceAllocationApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResourceAllocationApplication.class, args);
	}

	@Bean
	CommandLineRunner run(
			CreateRoleService createRole,
			CreateProjectService createProject,
			CreateCollaboratorService createCollaborator,
			CreateAllocationService createAllocation) {
		return args -> {
			createRole.execute(new Role(null, "USER"));
			createRole.execute(new Role(null, "ADMIN"));

			Project project = new Project();
			project.setName("E-commerce");
			project.setStartDate(LocalDateTime.now());
			project.setEndDate(LocalDateTime.of(2022, 11, 1, 14, 0, 0));
			Project createdProject = createProject.execute(project);

			Collaborator collaborator = new Collaborator();
			collaborator.setName("Marcus");
			Collaborator createdCollaborator = createCollaborator.execute(collaborator);

			Allocation allocation = new Allocation();
			allocation.setId(new AllocationId(createdProject.getId(), createdCollaborator.getId(), "collaborator"));
			allocation.setStartDate(LocalDateTime.now());
			allocation.setEndDate(LocalDateTime.of(2022, 11, 1, 21, 0, 0));
			createAllocation.execute(allocation);
		};
	}
}
