package br.edu.ufca.forms.service;

import br.edu.ufca.forms.model.Usuario;
import br.edu.ufca.forms.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService extends AbstractService<Usuario> {

    private UsuarioRepository repository;

    @Autowired
    public UsuarioService(UsuarioRepository repository) {
        this.repository = repository;
    }

    @Override
    public UsuarioRepository getRepository() {
        return repository;
    }

}
