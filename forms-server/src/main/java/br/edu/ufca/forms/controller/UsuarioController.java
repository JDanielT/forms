package br.edu.ufca.forms.controller;

import br.edu.ufca.forms.model.Usuario;
import br.edu.ufca.forms.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController extends AbstractController<Usuario> {

    private UsuarioService service;

    @Autowired
    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @Override
    public UsuarioService getService() {
        return service;
    }

}