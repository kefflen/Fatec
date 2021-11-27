package fatecfranca.edu.br.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import fatecfranca.edu.br.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
