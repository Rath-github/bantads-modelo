package com.bantads.auth.auth.amqp;

import java.io.Serializable;

import com.bantads.auth.auth.serializers.LoginDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthTransfer implements Serializable {
    private LoginDTO login;
    private String action;
}
