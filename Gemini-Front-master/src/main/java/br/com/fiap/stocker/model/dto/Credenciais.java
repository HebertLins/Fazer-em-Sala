package br.com.fiap.stocker.model.dto;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public record Credenciais (
    String email,
    String senha
)

{

    public Authentication ToAuthentication() {
        return new UsernamePasswordAuthenticationToken(email, senha);
    }}
