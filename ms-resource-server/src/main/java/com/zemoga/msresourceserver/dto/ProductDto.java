package com.zemoga.msresourceserver.dto;

import lombok.Data;

/**
 * @project profile-zemoga
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 5/09/2023
 **/
@Data
public class ProductDto {
    private String title;
    private String description;
    private String[] images;
}
