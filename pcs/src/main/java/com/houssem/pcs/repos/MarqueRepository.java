package com.houssem.pcs.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.houssem.pcs.entities.Marque;
@RepositoryRestResource(path="mar")
@CrossOrigin(origins = "http://localhost:4200/")
public interface MarqueRepository extends JpaRepository<Marque, Long>{

}
