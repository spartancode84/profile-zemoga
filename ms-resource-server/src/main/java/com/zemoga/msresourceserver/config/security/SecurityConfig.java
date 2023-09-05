package com.zemoga.msresourceserver.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.JwtDecoders;
import org.springframework.security.oauth2.server.resource.authentication.JwtAuthenticationConverter;
import org.springframework.security.oauth2.server.resource.authentication.JwtGrantedAuthoritiesConverter;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

/**
 * @project profile-zemoga
 * @autor Oscar Alfredo Chafloque Tampeck
 * @date 25/08/2023
 **/
@Configuration
public class SecurityConfig {
    @Bean
    @Order(2)
    SecurityFilterChain clientSecurityFilterChain(HttpSecurity http) throws Exception {
        http.formLogin(Customizer.withDefaults());
        http.authorizeHttpRequests(auth -> auth
                .requestMatchers(ADMIN_RESOURCES).hasRole(ROLE_ADMIN)
                .requestMatchers(USER_RESOURCES).hasRole(ROLE_USER)
                .anyRequest().permitAll());
        http.oauth2ResourceServer(oauth -> oauth.jwt(
                jwtConfigurer -> jwtConfigurer.decoder(JwtDecoders.fromIssuerLocation("http://localhost:9000"))
        ));

        return http.build();
    }

    @Bean
    JwtAuthenticationConverter jwtAuthenticationConverter() {
        var authConverter = new JwtGrantedAuthoritiesConverter();
        authConverter.setAuthoritiesClaimName("roles");
        authConverter.setAuthorityPrefix("");
        var converterResponse = new JwtAuthenticationConverter();
        converterResponse.setJwtGrantedAuthoritiesConverter(authConverter);
        return converterResponse;
    }

/*    @Bean
    PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }*/

    private static final String[] USER_RESOURCES = {"/loans/**"};
    private static final String[] ADMIN_RESOURCES = {"/profile/**", "/bussinnes/**"};
    private static final String ROLE_ADMIN = "ADMIN";
    private static final String ROLE_USER = "USER";
}
