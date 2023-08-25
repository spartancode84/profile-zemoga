package com.zemoga.msauthorizationserver.repository;

import com.zemoga.msauthorizationserver.model.Partner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @project ms-security
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 24/08/2023
 **/
@Repository
public interface PartnerRepository extends JpaRepository<Partner, Long> {
    Optional<Partner> findByClientId(String clientId);
}
