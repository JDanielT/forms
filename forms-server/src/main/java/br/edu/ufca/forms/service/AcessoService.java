package br.edu.ufca.forms.service;

import br.edu.ufca.forms.model.Acesso;
import br.edu.ufca.forms.repository.AcessoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcessoService extends AbstractService<Acesso> {

    private AcessoRepository repository;

    @Autowired
    public AcessoService(AcessoRepository repository) {
        this.repository = repository;
    }

    @Override
    public AcessoRepository getRepository() {
        return repository;
    }

}
