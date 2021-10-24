package fatecfranca.edu.br.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fatecfranca.edu.br.model.Paciente;
import fatecfranca.edu.br.repositories.PacienteRepository;

@RestController
public class PacienteController {
	@Autowired
	PacienteRepository injecao;
	
	@GetMapping("/paciente")
	public List<Paciente> get() {
		
		return injecao.findAll();
	}
	
	@PostMapping("/paciente")
	public String add(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		return "Paciente salvo com sucesso";
	}
	
	@DeleteMapping("/paciente/{id}")
	public String remove(@PathVariable Long id) {
		injecao.deleteById(id);
		return "Removido com sucesso";
	}
	
	@PutMapping("/paciente")
	public String update(@RequestBody Paciente paciente) {
		injecao.save(paciente);
		return "Atualização realizada com sucesso";
	}
}
