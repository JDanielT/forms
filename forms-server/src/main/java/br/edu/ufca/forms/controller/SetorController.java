package br.edu.ufca.forms.controller;

import br.edu.ufca.forms.model.Setor;
import br.edu.ufca.forms.service.SetorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/setores")
public class SetorController extends AbstractController<Setor> {

    private SetorService service;

    @Autowired
    public SetorController(SetorService service) {
        this.service = service;
    }

    @Override
    public SetorService getService() {
        return service;
    }

}
