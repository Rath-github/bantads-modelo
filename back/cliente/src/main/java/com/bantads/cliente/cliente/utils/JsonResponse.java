package com.bantads.cliente.cliente.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JsonResponse {
    private Boolean success;
    private String message;
    private Object data;
}
