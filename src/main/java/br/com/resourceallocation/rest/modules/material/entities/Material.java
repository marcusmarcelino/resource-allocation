package br.com.resourceallocation.rest.modules.material.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.resourceallocation.rest.modules.resource.entities.Resource;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "material")
@DiscriminatorValue("material")
public class Material extends Resource {
  @Column(name = "description")
  private String description;
}
