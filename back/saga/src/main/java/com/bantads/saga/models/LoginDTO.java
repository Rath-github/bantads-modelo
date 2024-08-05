package com.bantads.saga.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginDTO implements Serializable {
    private Long id;
    private String email;
    private String password;
    private Long user_id;
    private String token;
    private String role;
}
