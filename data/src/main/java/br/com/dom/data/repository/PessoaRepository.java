package br.com.dom.data.repository;


import br.com.dom.core.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
}
