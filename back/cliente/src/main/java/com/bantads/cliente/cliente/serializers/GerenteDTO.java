package com.bantads.cliente.cliente.serializers;

import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GerenteDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nome;
    private String email;
    private String cpf;
    private Integer numClientes;
    private String password;
}
