package com.bantads.saga.amqp;

import java.io.Serializable;

import com.bantads.saga.models.GerenteDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class GerenteTransfer implements Serializable {
    private static final long serialVersionUID = 1L; // Adicione um UID para a serialização

    private GerenteDTO gerente;
    private Long cliente;
    private String action;
}
