package com.houssem.pcs.service;

import java.util.List;

import com.houssem.pcs.entities.Marque;
import com.houssem.pcs.entities.Pc;

public interface PcService {

	Pc savePc(Pc p);
	Pc updatePc(Pc p);
	void deletePc(Pc p);
	 void deletePcById(Long id);
	 Pc getPc(Long id);
	List<Pc> getAllPcs();
	List<Pc> findByModele(String modele);
	List<Pc> findByModeleContains(String modele);
	List<Pc> findByModelePrix (String modele, Double prix);
	List<Pc> findByMarque (Marque marque);
	List<Pc> findByMarqueIdMarque(Long id);
	List<Pc> findByOrderByModeleAsc();
	List<Pc> trierModelePrix ();

}
