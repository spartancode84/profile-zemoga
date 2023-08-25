package com.zemoga.msauthorizationserver.service.impl;

import com.zemoga.msauthorizationserver.repository.UsuarioRepository;
import com.zemoga.msauthorizationserver.repository.UsuarioRolRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @project ms-security
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 24/08/2023
 **/
@Service
@Transactional
@AllArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {

    private final UsuarioRepository usuarioRepository;
    private final UsuarioRolRepository usuarioRolRepository;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        return usuarioRepository.findByEmail(email)
                .map(usuario -> new User(email, usuario.getPassword(), true, true, true, true,
                        usuarioRolRepository.findRolesByIdUsuario(usuario.getIdUsuario()).stream()
                                .map(role -> new SimpleGrantedAuthority(role.getName()))
                                .collect(Collectors.toList())))
                .orElseThrow(() -> new UsernameNotFoundException("El email " + email + " no existe."));
    }
}
