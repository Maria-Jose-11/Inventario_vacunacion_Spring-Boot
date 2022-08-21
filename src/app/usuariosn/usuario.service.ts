import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from './usuario';

@Injectable({
  providedIn: 'root'
})
export class UsuarioService {

  private url:string="http://localhost:8080/usuarios";

  constructor(private http:HttpClient) { }

  //OBTENER LISTA DE USUARIOS
  getAll():Observable<Usuario[]>{
    return this.http.get<Usuario[]>(this.url);
  }

  //CREAR NUEVO USUARIO
  create(usuario:Usuario):Observable<Usuario>{
    return this.http.post<Usuario>(this.url, usuario);
  }

  //OBTENER UN SOLO USUARIO
  get(id: number):Observable<Usuario>{
    return this.http.get<Usuario>(this.url+'/'+id);
  }


  //ACTUALIZAR
  update(usuario:Usuario):Observable<Usuario>{
    return this.http.put<Usuario>(this.url, usuario);
  }

  //ELIMINAR
  delete(id: number):Observable<Usuario>{
    return this.http.delete<Usuario>(this.url+'/'+id);
  }
  
}
