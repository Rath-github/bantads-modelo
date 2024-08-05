package com.bantads.saga.amqp;

import java.io.Serializable;

import com.bantads.saga.models.ClienteDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ClienteTransfer implements Serializable {
    private ClienteDTO cliente;
    private String action;
}
