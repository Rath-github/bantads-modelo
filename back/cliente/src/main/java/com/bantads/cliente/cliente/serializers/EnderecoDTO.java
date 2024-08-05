package com.bantads.cliente.cliente.serializers;

import lombok.Data;
import java.io.Serializable;

@Data
public class EnderecoDTO implements Serializable {
    private Long id;
    private String rua;
    private String numero;
    private String complemento;
    private String cep;
    private String cidade;
    private String estado;
}
