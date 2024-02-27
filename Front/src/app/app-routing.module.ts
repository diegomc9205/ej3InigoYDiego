import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormularioComponent } from './components/formulario/formulario.component';
import { BuscadorComponent } from './components/buscador/buscador.component';

const routes: Routes = [
  {path: 'formulario', component: FormularioComponent, title: 'formulario'},
  {path: 'buscador', component: BuscadorComponent, title: 'buscador'}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
