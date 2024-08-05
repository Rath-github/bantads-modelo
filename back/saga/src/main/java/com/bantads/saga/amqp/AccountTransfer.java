package com.bantads.saga.amqp;

import com.bantads.saga.models.AccountDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class AccountTransfer implements Serializable {
    private AccountDTO account;
    private String action;

}
