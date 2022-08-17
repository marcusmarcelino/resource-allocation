package br.com.resourceallocation.rest.modules.project.entities;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@Table(name = "projects")
public class Project {
  @EqualsAndHashCode.Include
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequencia")
  // @SequenceGenerator(name = "sequencia", sequenceName = "seq_projeto")

  // @GeneratedValue(strategy = GenerationType.TABLE, generator = "tabela")
  // @TableGenerator(name = "tabela", table = "identificador", pkColumnName =
  // "nome_chave", pkColumnValue = "projeto", valueColumnName = "proximo_valor")
  @Column(name = "id", unique = true, nullable = false)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "start_date")
  private LocalDateTime startDate;

  @Column(name = "end_date")
  private LocalDateTime endDate;
}
