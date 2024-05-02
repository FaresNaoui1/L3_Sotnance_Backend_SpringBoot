package com.SotnanceL3.SotnanceL3Api.config;

import com.SotnanceL3.SotnanceL3Api.repository.RapportRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RapportConfig {
@Bean
CommandLineRunner commandLineRunner (RapportRepository rapportrepository)
{
    return args -> {
            
    };
}
}
