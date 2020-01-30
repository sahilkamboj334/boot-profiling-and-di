package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.main.models.Entity;

@SpringBootApplication
public class BootProfileAndDiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootProfileAndDiApplication.class, args);
	}
	//now bean will be registered as per active profile.
	// autowiring will return this object as per active profile.
	@Bean(initMethod = "init",destroyMethod = "destroy")
	@Profile("dev")
	public Entity entity() {
		return new Entity("dev");
	}
	@Bean
	@Profile("test")
	public Entity testEntity() {
		return new Entity("test");
	}
	
	
	
	// added CORS policy globally
	@Bean
	public WebMvcConfigurer configure() {
		System.out.println("adasdsadas");
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("*");
			}
		};
	}
}
