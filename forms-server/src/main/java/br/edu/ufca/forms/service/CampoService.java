package br.edu.ufca.forms.service;

import br.edu.ufca.forms.model.Campo;
import br.edu.ufca.forms.repository.CampoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CampoService extends AbstractService<Campo> {

    private CampoRepository repository;

    @Autowired
    public CampoService(CampoRepository repository) {
        this.repository = repository;
    }

    @Override
    public CampoRepository getRepository() {
        return repository;
    }

}
