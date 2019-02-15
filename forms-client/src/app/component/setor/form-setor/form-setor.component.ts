import {Component, Injector, OnInit} from '@angular/core';
import {AbstractFormComponent} from "../../abstract/abstract-form-component";
import {Setor} from "../../../model/setor";
import {SetorService} from "../../../service/setor-service";

@Component({
  selector: 'app-form-setor',
  templateUrl: './form-setor.component.html',
  styleUrls: ['./form-setor.component.css']
})
export class FormSetorComponent extends AbstractFormComponent<Setor> {

  constructor(injector: Injector,
              private setorService: SetorService) {
    super(injector, Setor);
  }

  getService(): SetorService {
    return this.setorService;
  }

}
