package com.kavindu.loginregister_oauth.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class sequrityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(auth->auth
                        .requestMatchers("/","/login").permitAll()
                        .anyRequest().authenticated()
                )
                .oauth2Login(oauth-> oauth
                        .loginPage("/login")
                        .defaultSuccessUrl("/profile",true)
                )
                .logout(logout->logout
                        .logoutSuccessUrl("/")
                );

        return http.build();

    }
}
