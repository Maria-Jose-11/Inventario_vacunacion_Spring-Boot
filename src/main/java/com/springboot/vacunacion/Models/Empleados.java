package com.springboot.vacunacion.Models;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
public class Empleados {


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

    //valores que pueden ser nulos


    //FECHA DE NACIMIENTO
    @Past(message = "Fecha ingresada no valida")
    private Date fecha_nac;

    //DIRECCION DOMICILIARIA
    @com.sun.istack.NotNull
    private String direccion;

    //TELÉFONO MÓVIL
    private String telefono_movil;

    //ESTADO DE VACUNACIÓN
    private String estado_vacuna;

        //TIPO DE VACUNACIÓN
    /*enum tipo_vacuna{
        Sputnik,
        AstraZeneca,
        Pfizer,
        Jhonson
    }
    @Enumerated(EnumType.STRING)
    private String tipo_vacuna;
     */

        //FECHA DE VACUNACIÓN

        //NUMERO DE DOSIS


    //getters and seeders

    public long getId() {
        return id;
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

    public Date getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(Date fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono_movil() {
        return telefono_movil;
    }

    public void setTelefono_movil(String telefono_movil) {
        this.telefono_movil = telefono_movil;
    }

    public String getEstado_vacuna() {
        return estado_vacuna;
    }

    public void setEstado_vacuna(String estado_vacuna) {
        this.estado_vacuna = estado_vacuna;
    }
}
