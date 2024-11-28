package com.houssem.pcs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.houssem.pcs.entities.Marque;
import com.houssem.pcs.entities.Pc;

@SpringBootApplication

public class PcsApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	public static void main(String[] args) {
		SpringApplication.run(PcsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfiguration.exposeIdsFor(Pc.class,Marque.class);		
	}

}
