package br.com.jonathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("br.com.jonathan")
public class ConfigurationClientStartUp {

	public static void main(String[] args) {
		SpringApplication.run(ConfigurationClientStartUp.class, args);
	}

	// Commands
	// http://localhost:3000/configclient/info <-- application
	// http://localhost:3000/configclient/refresh <-- update

}