import { Observable } from 'rxjs';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import {API} from "../app.api";
import {BaseEntity} from "../model/base-entity";

export abstract class AbstractCrudService<T extends BaseEntity> {

  protected api = API;
  protected httpHeaders = new HttpHeaders({ 'Content-Type': 'application/json' });

  constructor(protected http: HttpClient) {
  }

  abstract context(): string;

  getApi(): string{
    return this.api;
  }

  getAll(): Observable<T[]> {
    return this.http.get<T[]>(`${this.api}/${this.context()}`);
  }

  getById(id: number): Observable<T> {
    return this.http.get<T>(`${this.api}/${this.context()}/${id}`);
  }

  save(object: T): Observable<T> {
    console.log(object);
    return this.http.post<T>(this.api + '/' + this.context(), object, { headers: this.httpHeaders });
  }

  delete(id: number): Observable<T> {
    return this.http.delete<T>(`${this.api}/${this.context()}/${id}`, { headers: this.httpHeaders });
  }

}
