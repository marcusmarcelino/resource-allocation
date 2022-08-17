package br.com.resourceallocation.rest.modules.allocation.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.Table;

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

  @Column(name = "start_date")
  private LocalDateTime startDate;

  @Column(name = "end_date")
  private LocalDateTime endDate;
}
