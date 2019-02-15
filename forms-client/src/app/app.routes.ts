import {Routes} from "@angular/router";
import {ListSetorComponent} from "./component/setor/list-setor/list-setor.component";
import {FormSetorComponent} from "./component/setor/form-setor/form-setor.component";

export const ROUTES: Routes = [
  {path: 'setores', component: ListSetorComponent},
  {path: 'setores/novo', component: FormSetorComponent},
  {path: 'setores/:id/edicao', component: FormSetorComponent}
]
