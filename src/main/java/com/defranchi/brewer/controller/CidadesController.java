package com.defranchi.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/estilos/v1")
public class CidadesController {

	@RequestMapping("/novo")
	public String nova() {
		return "estilo/CadastroEstilo";
	}

}