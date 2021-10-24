package fatecfranca.edu.br.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class SaudacaoController {
	
	@GetMapping("/saudacao/dia")
	public String enviaSaudacaoDia() {
		
		return "Bom dia";
	}
	
	@GetMapping("/saudacao/tarde")
	public String enviaSaudacaoTarde() {
		
		return "Boa tarde";
	}
	
	@GetMapping("/saudacao/noite")
	public String enviaSaudacaoNoite() {
		
		return "Boa noite";
	}
	
	@GetMapping("/saudacao/{nome}")
	public String enviaSaudacaoNome(@PathVariable String nome) {
		return "Bom dia " + nome;
	}
	
	
}
