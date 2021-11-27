package fatecfranca.edu.br;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fatecfranca.edu.br.model.Comentario;
import fatecfranca.edu.br.model.Medico;
import fatecfranca.edu.br.model.Paciente;
import fatecfranca.edu.br.model.Postagem;
import fatecfranca.edu.br.repositories.MedicoRepository;
import fatecfranca.edu.br.repositories.PostagemRepository;

@SpringBootApplication
public class PostgresApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(PostgresApplication.class, args);
	}
	
	@Autowired
	PostagemRepository postagemRepository;
	@Autowired
	MedicoRepository medicoRepository;
	

	@Override
	public void run(String ...strings) throws Exception {
		Postagem post = new Postagem();
		post.setAutor("Marcos Pedro");
		post.setTexto("Vai ter prova na proxima quarta feira");
		post.setQtdLikes(8);
		
		Comentario comment = new Comentario();
		comment.setAutor("Kefflen");
		comment.setTexto("Obrigado marcos pela informação");
		
		Comentario comment2 = new Comentario();
		comment.setAutor("Vinicius");
		comment.setTexto("Vou estudar bastante!!!");
		
		post.getComentarios().add(comment);
		post.getComentarios().add(comment2);
		
		postagemRepository.save(post);
		
		Medico medic = new Medico();
		medic.setCrm("1234567890");
		medic.setEspecialidade("Analgegista");
		medic.setNome("Roberto");
		
		Paciente paciente1 = new Paciente();
		paciente1.setNome("Leandro");
		paciente1.setCpf("1234567891");
		paciente1.setIdade(24);
		paciente1.setPeso(65);
		
		Paciente paciente2 = new Paciente();
		paciente2.setNome("Eliza");
		paciente2.setCpf("1234567892");
		paciente2.setIdade(24);
		paciente2.setPeso(70);
		
		Paciente paciente3 = new Paciente();
		paciente3.setNome("Carla");
		paciente3.setCpf("1234567893");
		paciente3.setIdade(27);
		paciente3.setPeso(62);
		
		List<Paciente> pacientes = Arrays.asList(paciente1, paciente2, paciente3);
		
		medic.setPacientes(pacientes);
		
		medicoRepository.save(medic);
	}
}
