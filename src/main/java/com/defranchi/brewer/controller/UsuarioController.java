package com.defranchi.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/usuarios/v1")
public class UsuarioController {

	@RequestMapping("/novo")
	public String novo() {
		return "usuario/CadastroUsuario";
	}

}
