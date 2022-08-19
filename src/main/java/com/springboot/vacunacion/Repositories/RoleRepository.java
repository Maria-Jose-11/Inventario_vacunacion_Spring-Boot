package com.springboot.vacunacion.Repositories;

import com.springboot.vacunacion.Models.RoleModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RoleRepository extends CrudRepository<RoleModel, Long>{

}