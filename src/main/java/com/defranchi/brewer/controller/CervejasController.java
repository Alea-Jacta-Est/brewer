package com.defranchi.brewer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cervejas/v1")
public class CervejasController {

	@RequestMapping("/novo")
	public String novo() {
		return "cerveja/CadastroCerveja";
	}
}
