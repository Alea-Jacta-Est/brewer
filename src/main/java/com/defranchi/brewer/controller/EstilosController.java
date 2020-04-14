package com.defranchi.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cidades/v1")
public class EstilosController {

	@RequestMapping("/nova")
	public String nova() {
		return "cidade/CadastroCidade";
	}

}