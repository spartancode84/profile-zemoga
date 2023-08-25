package com.zemoga.msauthorizationserver.model;

import jakarta.persistence.Embeddable;
import org.springframework.lang.NonNull;

import java.io.Serializable;

/**
 * @project ms-security
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 23/08/2023
 **/
@Embeddable
public class UsuarioRolKey implements Serializable {
    @NonNull
    private Long idRol;
    @NonNull
    private Long idUsuario;
}
