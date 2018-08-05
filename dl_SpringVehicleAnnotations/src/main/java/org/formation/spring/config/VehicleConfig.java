package org.formation.spring.config;

import org.formation.spring.components.CrazyDriver;
import org.formation.spring.components.Driver;
import org.formation.spring.components.ElectricMotor;
import org.formation.spring.components.GasEngine;
import org.formation.spring.components.GrandMother;
import org.formation.spring.components.Motor;
import org.formation.spring.service.Vehicle;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class VehicleConfig {

    @Bean
    public Driver crazyDriver() {
    	return new CrazyDriver();
    }
    
    @Bean
    public Driver grandMother() {
    	return new GrandMother();
    }
	
    @Bean
    public Motor electricMotor() {
    	return new ElectricMotor();
    }
    
    @Bean
    public Motor gasEngine() {
    	return new GasEngine();
    }
    
    @Bean
    @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    public Vehicle vehicle(Motor electricMotor, Driver grandMother) {
		return new Vehicle(electricMotor, grandMother);
    }
    
}
