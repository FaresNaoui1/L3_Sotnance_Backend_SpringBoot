package com.SotnanceL3.SotnanceL3Api.config;

import com.SotnanceL3.SotnanceL3Api.repository.PieceRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class PieceConfig {

    @Bean
    CommandLineRunner commandLineRunner(PieceRepository PieceRepository) {
        return args -> {
            
        };
    }
}
