package fatecfranca.edu.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fatecfranca.edu.br.model.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long> {

}
