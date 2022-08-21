import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { UsuariosComponent } from './usuarios/usuarios.component';
import { FormUsuariosComponent } from './usuarios/form-usuarios.component';
import {Routes, RouterModule} from '@angular/router'
import { FormsModule } from '@angular/forms';

//configuracion de rutas 

const routes:Routes=[
  {
    path:'',
    redirectTo:'/usuarios',
    pathMatch:'full'
  },

  {
    path:'usuarios',
    component:UsuariosComponent
  },

  {
    path:'usuarios/form',
    component:FormUsuariosComponent
  },

  {
    path:'usuarios/form/:id',
    component:FormUsuariosComponent
  },

]


@NgModule({
  declarations: [
    AppComponent,
    UsuariosComponent,
    FormUsuariosComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(routes),
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
