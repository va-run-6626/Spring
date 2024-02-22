package com.example.Config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.Services","com.example.implementations"})
public class ProjectConfig {
}
