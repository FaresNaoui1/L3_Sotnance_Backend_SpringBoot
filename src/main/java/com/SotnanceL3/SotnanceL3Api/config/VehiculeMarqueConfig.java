package com.SotnanceL3.SotnanceL3Api.config;

import com.SotnanceL3.SotnanceL3Api.repository.VehiculeMarqueRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehiculeMarqueConfig {
@Bean
CommandLineRunner commandLineRunner (VehiculeMarqueRepository VMrepository)
{
    return args -> {
            
    };
}
}