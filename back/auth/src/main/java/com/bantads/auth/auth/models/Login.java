package com.bantads.auth.auth.models;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "login")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login implements Serializable {

  private static final Long serialVersionUID = 1L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "email", unique = true)
  private String email;

  @Column(name = "password")
  private String password;

  @Column(name = "user_id", unique = false)
  private Long user_id;

  @Column(name = "role")
  private String role;

  @Transient
  private String token;
}
