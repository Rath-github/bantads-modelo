package com.bantads.cliente.cliente.serializers;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasicClienteDTO implements Serializable {
  private Long user;
  private String email;
  private String password;
  private String role;

  public BasicClienteDTO(ClienteDTO cliente) {
    this.user = cliente.getId();
    this.email = cliente.getEmail();
    this.password = cliente.getPassword();
    this.role = cliente.getRole();
  }
}
