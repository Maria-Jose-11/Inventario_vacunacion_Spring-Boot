import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Usuario } from './usuario';
import { UsuarioService } from './usuario.service';

@Component({
  selector: 'app-form-usuarios',
  templateUrl: './form-usuarios.component.html',
  styleUrls: ['./form-usuarios.component.css']
})
export class FormUsuariosComponent implements OnInit {

  usuario:Usuario = new Usuario();
  titulo:string="Registro de Usuarios";

  constructor(private usuarioService:UsuarioService, private router:Router, private activatedRoute:ActivatedRoute) { }

  ngOnInit(): void {
    this.cargar();
  }

  
  create():void{
    console.log(this.usuario);
    this.usuarioService.create(this.usuario).subscribe(
      res => this.router.navigate(['./usuarios'])
    );
  }

  //metodo para obtener información dell usuario y cargarla al formulario
  //revisar: no trae lla información 
  cargar():void{
    // console.log(this.usuario)
    this.activatedRoute.params.subscribe(
      e=>{
        let id=e['id'];
        if(id){
          this.usuarioService.get(id).subscribe(
            es=>this.usuario=es
          );
        }
      }
    );
  }

  //al no traer la info, se crea un nuevo usuario en lugar de actualizar
  update():void{
    this.usuarioService.update(this.usuario).subscribe(
      res => this.router.navigate(['./usuarios'])
    );
  }
  
}
