package com.bantads.cliente.cliente.serializers;

import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ClientAccountsDTO implements Serializable {
    private List<ClienteDTO> clientes;
    private Object accounts;
}
