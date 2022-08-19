package com.springboot.vacunacion.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "usuarios")
public class UserModel implements Serializable {
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


    /*@Transient
    //para no agregar este valor a la base de datos
    private String confirmPassword;

     */

    /*@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="user_roles"
            ,joinColumns=@JoinColumn(name="user_id")
            ,inverseJoinColumns=@JoinColumn(name="role_id"))
    private Set roles;*/

}
