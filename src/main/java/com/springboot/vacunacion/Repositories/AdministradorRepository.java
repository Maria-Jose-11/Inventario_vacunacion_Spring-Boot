package com.springboot.vacunacion.Repositories;


import com.springboot.vacunacion.Models.Administrador;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministradorRepository extends CrudRepository<Administrador, Long> {

}
