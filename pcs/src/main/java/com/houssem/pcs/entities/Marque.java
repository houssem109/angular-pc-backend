package com.houssem.pcs.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
public class Marque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long idMarque;
	private String nomMarque;
	
	
	@OneToMany(mappedBy = "marque")
	@JsonIgnore
	private List<Pc> pcs;
	
	
	
	
}
