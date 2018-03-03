package com.example.condominio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.example.condominio.model.Condominio;
import com.example.condominio.model.Morador;
import com.example.condominio.model.Unidade;
import com.example.condominio.repository.Condominios;
import com.example.condominio.repository.Moradores;
import com.example.condominio.repository.Unidades;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent> {

	@Autowired
	private Condominios condominios;

	@Autowired
	private Moradores moradores;

	@Autowired
	private Unidades unidades;

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {

		Condominio condominio = new Condominio();
		condominio.setEndereco("Savassi");
		condominio.setNome("Premiere");
		condominios.save(condominio);

		Morador morador = new Morador();

		morador.setNome("Rafael");
		morador.setNome("Egidio");
		moradores.save(morador);
		Unidade unidade = new Unidade();

		unidade.setCondominio(condominio);
		unidade.setNumeroUnidade(23);
		unidade.setMorador(morador);
		
		unidades.save(unidade);

		return;
	}
}