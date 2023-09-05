package com.zemoga.msresourceserver.controller;

import com.zemoga.msresourceserver.dto.ProfileResponseDto;
import com.zemoga.msresourceserver.service.ProfileService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project profile-zemoga
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 3/09/2023
 **/
@RestController
@RequestMapping(path = "/profile")
@AllArgsConstructor
public class ProfileController {
    private final ProfileService profileService;

    @GetMapping("/getProfileByEmail/{email}")
    ProfileResponseDto getProfileByEmail (@PathVariable String email){
       return profileService.getProfileByEmail(email);
    }
}
