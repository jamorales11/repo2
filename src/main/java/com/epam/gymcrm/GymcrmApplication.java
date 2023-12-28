package com.epam.gymcrm;

import com.epam.gymcrm.dto.TrainerDto;
import com.epam.gymcrm.facade.GymFacade;
import com.epam.gymcrm.facade.GymFacadeImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

@Configuration
@EnableAutoConfiguration
public class GymcrmApplication {


	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(GymcrmApplication.class);
		// ... customize application settings here
		application.run(args);

	}

	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

}

