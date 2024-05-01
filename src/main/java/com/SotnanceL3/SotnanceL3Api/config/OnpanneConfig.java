package com.SotnanceL3.SotnanceL3Api.config;

import com.SotnanceL3.SotnanceL3Api.repository.OnpanneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OnpanneConfig {
    @Bean
      CommandLineRunner commandLineRunner(OnpanneRepository onpanneRepository) {
        return args -> {
            
        };
    }
}
