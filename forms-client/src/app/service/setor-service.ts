import {AbstractCrudService} from "./abstract-crud-service";
import {Setor} from "../model/setor";
import {HttpClient} from "@angular/common/http";
import {Injectable} from "@angular/core";

@Injectable({
  providedIn: 'root'
})
export class SetorService extends AbstractCrudService<Setor> {

  constructor(http: HttpClient) {
    super(http);
  }

  context(): string {
    return "setores";
  }

}
