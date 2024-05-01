package com.SotnanceL3.SotnanceL3Api.config;

import com.SotnanceL3.SotnanceL3Api.repository.VehiculeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehiculeConfig {
@Bean
CommandLineRunner commandLineRunner (VehiculeRepository vehiculeRepository)
{
    return args -> {
            
    };
}
}