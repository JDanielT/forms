package br.edu.ufca.forms.service;

import br.edu.ufca.forms.model.Submissao;
import br.edu.ufca.forms.repository.SubmissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubmissaoService extends AbstractService<Submissao> {

    private SubmissaoRepository repository;

    @Autowired
    public SubmissaoService(SubmissaoRepository repository) {
        this.repository = repository;
    }

    @Override
    public SubmissaoRepository getRepository() {
        return repository;
    }

}