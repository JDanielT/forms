import { BaseEntity } from './../../model/base-entity';
import { Injector } from '@angular/core';
import {AbstractCrudComponent} from "./abstract-crud-component";

export abstract class AbstractListComponent extends AbstractCrudComponent {

  list: BaseEntity[];

  constructor(injector: Injector) {
    super(injector);
  }

  ngOnInit() {
    this.getService().getAll().subscribe(data => {
      this.list = data as BaseEntity[];
    });
  }

  getList(): Object[] {
    return this.list;
  }

  setList(list: BaseEntity[]) {
    this.list = list;
  }

  add(): void {
    this.router.navigate([`${this.getService().context()}/new`]);
  }

  update(entity: BaseEntity): void {
    this.router.navigate([`${this.getService().context()}/${entity.id}/edit`]);
  }

  delete(entity: BaseEntity): void {
    this.getService().delete(entity.id)
      .subscribe(data => this.list = this.list.filter(c => c !== entity),
        data => this.setError(data.error));
  }

}
