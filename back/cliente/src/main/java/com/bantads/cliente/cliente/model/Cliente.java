package com.bantads.cliente.cliente.model;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Cliente implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Long id;

  @Column(name = "nome")
  private String nome;

  @Column(name = "cpf")
  private String cpf;

  @Column(name = "aprovado")
  private String aprovado;

  @Column(name = "gerente")
  private int gerente;

  @Column(name = "conta")
  private Long conta;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "endereco", referencedColumnName = "id")
  private Endereco endereco;

  @Column(name = "salario")
  private int salario = 0;
}
