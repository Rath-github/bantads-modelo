package com.bantads.saga.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteDTO implements Serializable {
    private Long id;
    private String nome;
    private String cpf;
    private AccountStatus aprovado;
    private Long gerente;
    private Long conta;
    private EnderecoDTO endereco;
    private String email;
    private String password;
    private String role;
    private int salario;
}
