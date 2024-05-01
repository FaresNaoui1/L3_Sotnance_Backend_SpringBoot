package com.SotnanceL3.SotnanceL3Api.config;

import com.SotnanceL3.SotnanceL3Api.repository.VehiculeTypeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehiculeTypeConfig {
@Bean
CommandLineRunner commandLineRunner (VehiculeTypeRepository VTepository)
{
    return args -> {
            
    };
}
}
