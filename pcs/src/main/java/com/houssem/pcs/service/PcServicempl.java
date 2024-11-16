package com.houssem.pcs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.houssem.pcs.entities.Marque;
import com.houssem.pcs.entities.Pc;
import com.houssem.pcs.repos.PcRepository;
@Service
public class PcServicempl implements PcService{

	@Autowired
	PcRepository pcRepository;
	
	@Override
	public Pc savePc(Pc p) {
		return  pcRepository.save(p);
	}

	@Override
	public Pc updatePc(Pc p) {
		return  pcRepository.save(p);
	}

	@Override
	public void deletePc(Pc p) {
		pcRepository.delete(p);		
	}

	@Override
	public void deletePcById(Long id) {
		pcRepository.deleteById(id);		
	}

	@Override
	public Pc getPc(Long id) {
		return pcRepository.findById(id).get();
	}

	@Override
	public List<Pc> getAllPcs() {
		
		return pcRepository.findAll();
	}

	@Override
	public List<Pc> findByModele(String modele) {
		return pcRepository.findByModele(modele);
	}

	@Override
	public List<Pc> findByModeleContains(String modele) {
		return pcRepository.findByModeleContains(modele);
	}

	@Override
	public List<Pc> findByModelePrix(String modele, Double prix) {
		return pcRepository.findByModelePrix(modele,prix);
	}

	@Override
	public List<Pc> findByMarque(Marque marque) {
		return pcRepository.findByMarque(marque);
	}

	@Override
	public List<Pc> findByMarqueIdMarque(Long id) {
		// TODO Auto-generated method stub
		return pcRepository.findByMarqueIdMarque(id);
	}

	@Override
	public List<Pc> findByOrderByModeleAsc() {
		// TODO Auto-generated method stub
		return pcRepository.findByOrderByModeleAsc();
	}

	@Override
	public List<Pc> trierModelePrix() {
		return pcRepository.trierModelePrix();
	}

}
