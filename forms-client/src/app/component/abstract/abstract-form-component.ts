import { Observable, of } from 'rxjs';
import { Injector } from '@angular/core';
import { map } from 'rxjs/operators';
import {BaseEntity} from "../../model/base-entity";
import {AbstractCrudComponent} from "./abstract-crud-component";


export abstract class AbstractFormComponent<T extends BaseEntity> extends AbstractCrudComponent {

  public entity: T;

  constructor(injector: Injector, private entityClass: { new(): T }) {
    super(injector);
  }

  ngOnInit() {
    super.ngOnInit();
    this.preRegister().subscribe(data => { this.entity = data as T});
  }

  preRegister(): Observable<T> {
    let id: number = this.activateRoute.snapshot.params['id'];
    if (id) {
      return this.getService().getById(id).pipe(
        map(data => {
          return data as T;
        })
      );
    }
    return of(Object.assign(new this.entityClass()));
  }

  getEntity(): T {
    return this.entity;
  }

  setEntity(entity: T) {
    this.entity = entity;
  }

  submit() {
    this.getService().save(this.getEntity())
      .subscribe(data => this.router.navigate([this.getService().context()]),
        data => { this.setError(data.error); console.log(data) });
  }

}
