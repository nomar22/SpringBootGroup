package com.example.condominio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.condominio.model.Unidade;
import com.example.condominio.repository.Unidades;

@Controller
@RequestMapping("/unidade")
public class UnidadesController {

	@Autowired
	private Unidades unidades;

	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaUnidades");
		modelAndView.addObject("unidade", unidades.findAll());

		return modelAndView;
	}

	@PostMapping
	public String salvar(Unidade unidade) {
		this.unidades.save(unidade);
		return "redirect:/unidades";
	}

}
