package com.SotnanceL3.SotnanceL3Api.config;

import com.SotnanceL3.SotnanceL3Api.repository.MacanicianRepository;
import com.SotnanceL3.SotnanceL3Api.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MecanicianConfig {

    @Bean
    CommandLineRunner commandLineRunner(MacanicianRepository macanicianRepository) {
        return args -> {
            
        };
    }
}