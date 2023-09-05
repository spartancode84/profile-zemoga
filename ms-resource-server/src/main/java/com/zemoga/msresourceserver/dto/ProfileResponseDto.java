package com.zemoga.msresourceserver.dto;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @project profile-zemoga
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 3/09/2023
 **/
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfileResponseDto {
    private String apePaterno;
    private String apeMaterno;
    private String nombres;
    private String email;
    private String photo;
    private String resumeObjectives;
    private List<ProductDto> productos;
}
