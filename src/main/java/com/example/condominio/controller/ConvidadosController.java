package com.example.condominio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.condominio.model.Condominio;
import com.example.condominio.repository.Condominios;

@Controller
@RequestMapping("/condominio")
public class ConvidadosController {

	@Autowired
	private Condominios condominios;

	@GetMapping
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("ListaCondominio");
		modelAndView.addObject("condominio", condominios.findAll());
		modelAndView.addObject("convidado", new Condominio());

		return modelAndView;
	}

	@PostMapping
	public String salvar(Condominio condominio) {
		this.condominios.save(condominio);
		return "redirect:/condominios";
	}

}
