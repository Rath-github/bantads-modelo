package com.bantads.cliente.cliente.serializers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
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
