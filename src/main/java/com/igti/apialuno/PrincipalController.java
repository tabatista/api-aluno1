package com.igti.apialuno;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/")
public class PrincipalController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String saudacao() {
		return "Olá, mundo! Aqui é a Thais! Esta é a atividade prévia";
	}

}
