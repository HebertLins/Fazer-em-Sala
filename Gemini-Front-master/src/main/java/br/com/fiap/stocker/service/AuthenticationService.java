package br.com.fiap.stocker.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.fiap.stocker.repository.UsuarioRepository;

@Service
public class AuthenticationService implements UserDetailsService
{

    @Autowired
    UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return repository.findByEmail(email)
            .orElseThrow(() -> new UsernameNotFoundException("Usuario não encontrado!"));

    }
    
}
