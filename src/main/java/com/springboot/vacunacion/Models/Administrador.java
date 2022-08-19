package com.springboot.vacunacion.Models;


import javax.persistence.*;
import javax.validation.constraints.*;
@Entity

public class Administrador {

    //ID
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    //CEDULA
    @Column(unique = true, length = 10)
    @NotNull(message = "Campo cédula requerido")
    private String cedula;

    //NOMBRE
    @NotNull(message = "Campo nombre requerido")
    private String nombre;

    //APELLIDO
    @NotNull(message = "Campo apellido requerido")
    private String apellido;

    //EMAIL
    @Email(message = "Correo electrónico no válido")
    @Column(unique = true)
    @NotNull(message = "Campo correo electrónico requerido")
    private String email;

    //USUARIO
    @NotNull(message = "Usuario requerido")
    private String usuario;

    //NOMBRE
    @NotNull(message = "Contraseña requerida")
    private String password;

    //getters and seeders
    public long getId() {
        return id;
    }

    {

    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    /*public static boolean soloLetras(String cadena){
        for (int x = 0; x < cadena.length(); x++) {
            char c = cadena.charAt(x);
            // Si no está entre a y z, ni entre A y Z, ni es un espacio
            if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || c == ' ')) {
                return false;
            }
        }
        return true;
    }
    */



}
