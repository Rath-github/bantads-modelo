package com.bantads.cliente.cliente.serializers;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class AccountDTO implements Serializable {
    private Long id;
    private Long userId;
    private Double balance;
    private Double limit;

    public AccountDTO(Long id, Long userId, Double balance, Double limit) {
        this.id = id;
        this.userId = userId;
        this.balance = balance;
        this.limit = limit;
    }
}
