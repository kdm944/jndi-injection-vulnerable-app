package com.grzebielucha.poc.jndiinjection;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
public class JndiInjectionApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JndiInjectionApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(JndiInjectionApplication.class, args);
	}

}
