package com.defranchi.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clientes/v1")
public class ClientesController {

	@RequestMapping("/novo")
	public String novo() {
		return "cliente/CadastroCliente";
	}
}
