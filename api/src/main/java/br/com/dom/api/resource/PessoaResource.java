package br.com.dom.api.resource;

import br.com.dom.core.model.Pessoa;
import br.com.dom.data.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/")
public class PessoaResource {

    @Autowired
    private PessoaRepository repository;

    @GetMapping
    public List<Pessoa> getAll(){
        return repository.findAll();
    }
}
