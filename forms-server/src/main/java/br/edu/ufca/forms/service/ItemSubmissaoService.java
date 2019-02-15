package br.edu.ufca.forms.service;

import br.edu.ufca.forms.model.ItemSubmissao;
import br.edu.ufca.forms.repository.ItemSubmissaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemSubmissaoService extends AbstractService<ItemSubmissao> {

    private ItemSubmissaoRepository repository;

    @Autowired
    public ItemSubmissaoService(ItemSubmissaoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ItemSubmissaoRepository getRepository() {
        return repository;
    }

}