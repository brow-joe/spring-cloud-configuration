package br.com.jonathan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.config.server.ConfigServerApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@EnableConfigServer
public class ConfigurationServerStartUp {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}

	// Commands
	// http://localhost:8888/configserver/info <-- application
	// http://localhost:8888/configserver/application/test/configuration <-- file

	/*
	 * http://localhost:8888/{name}/{env}/{label} 
	 * 
	 * {name} é o nome do arquivo no repositório; 
	 * {env} é o profile do arquivo (o valor default é sem informar um profile do arquivo) 
	 * {label} a branch do repositório dos arquivos (opcional sendo o default: master)
	 */
}