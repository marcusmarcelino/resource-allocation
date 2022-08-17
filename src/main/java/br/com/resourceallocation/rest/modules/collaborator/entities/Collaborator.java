package br.com.resourceallocation.rest.modules.collaborator.entities;

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
@Table(name = "collaborator")
@DiscriminatorValue("collaborator")
public class Collaborator extends Resource {
  @Column(name = "name")
  private String name;

  @Column(name = "email")
  private String email;
}
