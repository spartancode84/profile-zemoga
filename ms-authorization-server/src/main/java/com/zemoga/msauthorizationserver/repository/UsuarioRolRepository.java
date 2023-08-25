package com.zemoga.msauthorizationserver.repository;

import com.zemoga.msauthorizationserver.model.Rol;
import com.zemoga.msauthorizationserver.model.UsuarioRol;
import com.zemoga.msauthorizationserver.model.UsuarioRolKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @project ms-security
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 23/08/2023
 **/
@Repository
public interface UsuarioRolRepository extends JpaRepository<UsuarioRol, UsuarioRolKey> {

    @Query("select u.rol from UsuarioRol u where u.idUsuarioRol.idUsuario =?1")
    List<Rol> findRolesByIdUsuario(Long idUsuario);

}
