package br.edu.ufca.forms.service;

import br.edu.ufca.forms.model.RedefinicaoSenha;
import br.edu.ufca.forms.repository.RedefinicaoSenhaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedefinicaoSenhaService extends AbstractService<RedefinicaoSenha> {

    private RedefinicaoSenhaRepository repository;

    @Autowired
    public RedefinicaoSenhaService(RedefinicaoSenhaRepository repository) {
        this.repository = repository;
    }

    @Override
    public RedefinicaoSenhaRepository getRepository() {
        return repository;
    }

}