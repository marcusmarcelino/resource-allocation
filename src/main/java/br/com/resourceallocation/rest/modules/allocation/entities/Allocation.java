package br.com.resourceallocation.rest.modules.allocation.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

import br.com.resourceallocation.rest.modules.project.entities.Project;
import br.com.resourceallocation.rest.modules.resource.entities.Resource;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "allocation")
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Allocation {
  @EqualsAndHashCode.Include
  @EmbeddedId
  private AllocationId id;

  @MapsId("project")
  @ManyToOne
  @JoinColumn(name = "project_id", insertable = false, updatable = false)
  private Project project;

  @MapsId("resource")
  @ManyToOne
  @JoinColumn(name = "resource_id", insertable = false, updatable = false)
  private Resource resource;

  @Column(name = "start_date")
  private LocalDateTime startDate;

  @Column(name = "end_date")
  private LocalDateTime endDate;
}
