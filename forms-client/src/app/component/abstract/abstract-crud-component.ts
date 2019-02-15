import {Router, ActivatedRoute} from '@angular/router';
import {OnInit, Injector} from '@angular/core';
import {AbstractCrudService} from "../../service/abstract-crud-service";

declare let $: any;

export abstract class AbstractCrudComponent implements OnInit {

  public error: any;

  protected router: Router;
  protected activateRoute: ActivatedRoute;

  constructor(injector: Injector) {
    this.router = injector.get(Router);
    this.activateRoute = injector.get(ActivatedRoute);
  }

  abstract getService(): AbstractCrudService<any>;

  ngOnInit() {
    this.loadMasks();
  }

  getError(): any {
    return this.error;
  }

  setError(error: any) {
    return this.error = error;
  }

  private loadMasks() {
    $(document).ready(function () {

      $('.placa').mask('AAA-0000', {
        'translation': {
          A: {pattern: /[A-Za-z]/}
        }
      });
      $('.data').mask('00/00/0000');
      $('.anoModelo').mask('0000/0000');
      $('.cpf').mask('000.000.000-00', {reverse: true});
    });
  }

  compareBaseEntity(o1, o2): boolean {
    return (o1 && o2) && (o1.id === o2.id);
  }

}
