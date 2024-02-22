package com.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.example.Implimentation", "com.example.Services"})
@ComponentScan(basePackageClasses = {com.example.beans.Vehicle.class , com.example.beans.Person.class})
public class ProjectConfig {
}
