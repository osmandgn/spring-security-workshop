package com.workshop.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AuthenticatonRequest {

    private String username;
    private String password;
}
