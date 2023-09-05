package com.zemoga.msauthorizationserver.model;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

/**
 * @project ms-integrated
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 18/08/2023
 **/

@Entity
@Data
public class Usuario {
    @Id
    private Long idUsuario;

    private String nombre;

    @Column(unique = true)
    private String email;
    private String password;
}
