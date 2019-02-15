package br.edu.ufca.forms.service;

import br.edu.ufca.forms.model.Setor;
import br.edu.ufca.forms.repository.SetorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SetorService extends AbstractService<Setor> {

    private SetorRepository repository;

    @Autowired
    public SetorService(SetorRepository repository) {
        this.repository = repository;
    }

    @Override
    public SetorRepository getRepository() {
        return repository;
    }

}