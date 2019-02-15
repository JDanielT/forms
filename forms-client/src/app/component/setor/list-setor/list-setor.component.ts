import {Component, Injector} from '@angular/core';
import {AbstractListComponent} from "../../abstract/abstract-list-component";
import {SetorService} from "../../../service/setor-service";

@Component({
  selector: 'app-list-setor',
  templateUrl: './list-setor.component.html',
  styleUrls: ['./list-setor.component.css']
})
export class ListSetorComponent extends AbstractListComponent {

  constructor(private service: SetorService, injector: Injector) {
    super(injector);
  }

  getService(): SetorService {
    return this.service;
  }

}
