package com.zemoga.msresourceserver.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @project profile-zemoga
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 1/09/2023
 **/
@Builder
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Profile {
    @Id
    private Long idUsuario;
    private String apePaterno;
    private String apeMaterno;
    private String nombres;
    @Column(unique = true)
    private String email;
    @Column(columnDefinition = "TEXT")
    private String photo;
    @Column(columnDefinition = "TEXT")
    private String resumeObjectives;
}
