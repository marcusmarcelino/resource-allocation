package br.com.resourceallocation.rest.modules.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.resourceallocation.rest.modules.user.entities.Role;
import br.com.resourceallocation.rest.modules.user.services.CreateRoleService;

@RestController
@RequestMapping(value = "/roles")
public class RoleController {
  private CreateRoleService service;

  @PostMapping(value = "")
  public ResponseEntity<Role> create(@RequestBody Role role) {
    return ResponseEntity.ok().body(service.execute(role));
  }
}
