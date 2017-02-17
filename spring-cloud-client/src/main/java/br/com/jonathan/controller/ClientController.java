package br.com.jonathan.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ClientController {

	@Value("${custom.variable}")
	private String variable;

	@RequestMapping("/")
	public String getVariable() {
		return variable;
	}

}