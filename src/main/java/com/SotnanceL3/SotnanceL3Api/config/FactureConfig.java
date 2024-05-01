package com.SotnanceL3.SotnanceL3Api.config;

import com.SotnanceL3.SotnanceL3Api.repository.FactureRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FactureConfig {

    @Bean
      CommandLineRunner commandLineRunner(FactureRepository factureRepository) {
        return args -> {
            
        };
    }
}
