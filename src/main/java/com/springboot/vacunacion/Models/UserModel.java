package com.springboot.vacunacion.Models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "usuarios")
public class UserModel implements Serializable {
    //ID
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="native")
    @GenericGenerator(name="native",strategy="native")
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

    //FECHA DE NACIMIENTO
    @Past(message = "Fecha ingresada no valida")
    private Date fecha_nac;

    //DIRECCION DOMICILIARIA
    private String direccion;

    //TELÉFONO MÓVIL
    private String telefono_movil;

    //ESTADO DE VACUNACIÓN
    private String estado_vacuna;

        //TIPO DE VACUNA
        private enum tipo_vacuna{
            Sputnik,
            AstraZeneca,
            Pfizer,
            Jhonson
        }
        //FECHA DE VACUNACIÓN
        //NÚMERO DE DOSIS
        private int num_dosis;


    //getters and seeders
    public long getId() {
        return id;
    }


    @Transient
    //para no agregar este valor a la base de datos
    private String confirmPassword;


    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="user_roles"
            ,joinColumns=@JoinColumn(name="user_id")
            ,inverseJoinColumns=@JoinColumn(name="role_id"))
    private Set<RoleModel> roles;
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

    @Override
    public String toString() {
        return "UserModel{" +
                "id=" + id +
                ", cedula='" + cedula + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", usuario='" + usuario + '\'' +
                ", password='" + password + '\'' +
                ", fecha_nac=" + fecha_nac +
                ", direccion='" + direccion + '\'' +
                ", telefono_movil='" + telefono_movil + '\'' +
                ", estado_vacuna='" + estado_vacuna + '\'' +
                ", num_dosis=" + num_dosis +
                ", confirmPassword='" + confirmPassword + '\'' +
                ", roles=" + roles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserModel userModel = (UserModel) o;
        return id == userModel.id && num_dosis == userModel.num_dosis && Objects.equals(cedula, userModel.cedula) && Objects.equals(nombre, userModel.nombre) && Objects.equals(apellido, userModel.apellido) && Objects.equals(email, userModel.email) && Objects.equals(usuario, userModel.usuario) && Objects.equals(password, userModel.password) && Objects.equals(fecha_nac, userModel.fecha_nac) && Objects.equals(direccion, userModel.direccion) && Objects.equals(telefono_movil, userModel.telefono_movil) && Objects.equals(estado_vacuna, userModel.estado_vacuna) && Objects.equals(confirmPassword, userModel.confirmPassword) && Objects.equals(roles, userModel.roles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cedula, nombre, apellido, email, usuario, password, fecha_nac, direccion, telefono_movil, estado_vacuna, num_dosis, confirmPassword, roles);
    }
}
