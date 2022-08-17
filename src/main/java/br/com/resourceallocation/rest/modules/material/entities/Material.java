package br.com.resourceallocation.rest.modules.material.entities;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

import br.com.resourceallocation.rest.modules.resource.entities.Resource;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "material")
@DiscriminatorValue("material")
public class Material extends Resource {
  @Column(name = "description")
  private String description;
}
