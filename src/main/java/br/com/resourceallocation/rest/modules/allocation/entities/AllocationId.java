package br.com.resourceallocation.rest.modules.allocation.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class AllocationId implements Serializable {
  @EqualsAndHashCode.Include
  @Column(name = "project_id")
  private Long project;

  @EqualsAndHashCode.Include
  @Column(name = "resource_id")
  private Long resource;

  @EqualsAndHashCode.Include
  @Column(name = "type")
  private String type;
}
