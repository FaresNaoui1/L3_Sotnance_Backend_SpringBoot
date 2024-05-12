package com.SotnanceL3.SotnanceL3Api.config;

import com.SotnanceL3.SotnanceL3Api.repository.CheffeurRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CheffeurConfig {

    @Bean
    CommandLineRunner commandLineRunner(CheffeurRepository cheffeurRepository) {
        return args -> {
            
        };
    }
}
