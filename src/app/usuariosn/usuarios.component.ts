import { Component, OnInit } from '@angular/core';
import { Usuario } from './usuario';
import { UsuarioService } from './usuario.service';

@Component({
  selector: 'app-usuarios',
  templateUrl: './usuarios.component.html',
  styleUrls: ['./usuarios.component.css']
})
export class UsuariosComponent implements OnInit {
  titulo:string="LISTA DE USUARIOS";

  usuarios!: Usuario[];

  constructor(private usuarioService:UsuarioService) { }

  ngOnInit(): void {
    this.usuarioService.getAll().subscribe(
      us =>this.usuarios=us
    );
  }

  delete(usuario:Usuario): void{
    console.log("Delete");
    this.usuarioService.delete(usuario.id).subscribe(
      res=>this.usuarioService.getAll().subscribe(
        response=>this.usuarios=response
      )
    );
  }

}
