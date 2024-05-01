package com.SotnanceL3.SotnanceL3Api.config;

import com.SotnanceL3.SotnanceL3Api.repository.RollRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RollConfig {
@Bean
CommandLineRunner commandLineRunner (RollRepository rollrepository)
{
    return args -> {
            
    };
}
}
