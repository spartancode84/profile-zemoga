package com.zemoga.msresourceserver.service;

import com.zemoga.msresourceserver.dto.ProfileResponseDto;

import java.util.Optional;

/**
 * @project profile-zemoga
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 3/09/2023
 **/
public interface ProfileService {
    ProfileResponseDto getProfileByEmail (String email);
}
