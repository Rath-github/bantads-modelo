package com.bantads.auth.auth.serializers;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO implements Serializable {
  private Long id;
  private String email;
  private String password;
  private Long user_id;
  private String token;
  private Role role;
}
