import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = '';
  nuevo = '';
  constructor(private http: HttpClient) { }

  ngOnInit(){
    // this.http.get("http://localhost:8080/usuarios", {responseType: 'text'}).subscribe(
    //   (resp: any) =>{
    // this.nuevo = resp}
    // ) 

    // this.http.get("http://localhost:8080/nuevo", {responseType: 'text'}).subscribe(
    //   (resp: any) =>{
    // this.title = resp}
    // ) 
  }
}
