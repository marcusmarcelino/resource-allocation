package br.com.resourceallocation.rest.modules.user.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "roles")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Role {

  @Id
  @GeneratedValue
  private Long id;

  @Column(name = "name", unique = true)
  private String name;

  public Role(Long id) {
    this.id = id;
  }
}
