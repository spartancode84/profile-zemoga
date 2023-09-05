package com.zemoga.msresourceserver.config.feign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @project profile-zemoga
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 31/08/2023
 **/
@Configuration
@EnableFeignClients(basePackages = "com.zemoga.msresourceserver.controller.feign")
public class FeignConfig {
}
