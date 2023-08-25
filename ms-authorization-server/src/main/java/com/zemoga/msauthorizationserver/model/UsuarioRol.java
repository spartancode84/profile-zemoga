package com.zemoga.msauthorizationserver.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import org.hibernate.annotations.DynamicUpdate;

/**
 * @project ms-security
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 23/08/2023
 **/
@Entity
@DynamicUpdate
public class UsuarioRol {
    @EmbeddedId
    UsuarioRolKey idUsuarioRol;

    @ManyToOne
    @JoinColumn(name = "idRol", referencedColumnName = "idRol", insertable = false, updatable = false)
    Rol rol;

    @ManyToOne
    @JoinColumn(name = "idUsuario", referencedColumnName = "idUsuario", insertable = false, updatable = false)
    Usuario usuario;
}
