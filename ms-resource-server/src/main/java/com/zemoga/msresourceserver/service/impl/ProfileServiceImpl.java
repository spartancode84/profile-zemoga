package com.zemoga.msresourceserver.service.impl;

import com.zemoga.msresourceserver.controller.feign.TimeLineFeignClient;
import com.zemoga.msresourceserver.dto.ProfileResponseDto;
import com.zemoga.msresourceserver.repository.ProfileRepository;
import com.zemoga.msresourceserver.service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

/**
 * @project profile-zemoga
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 3/09/2023
 **/
@Service
@AllArgsConstructor
public class ProfileServiceImpl implements ProfileService {
    private final ProfileRepository profileRepository;
    private final TimeLineFeignClient timeLineFeignClient;

    @Override
    public ProfileResponseDto getProfileByEmail(String email) {
        return profileRepository.findByEmail(email)
                .map(profile -> ProfileResponseDto
                        .builder()
                        .apePaterno(profile.getApePaterno())
                        .apeMaterno(profile.getApeMaterno())
                        .nombres(profile.getNombres())
                        .email(profile.getEmail())
                        .photo(profile.getPhoto())
                        .resumeObjectives(profile.getResumeObjectives())
                        .productos(timeLineFeignClient.getTimeLines().stream().limit(10).collect(Collectors.toList()))
                        .build()).get();
    }
}
