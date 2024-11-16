package com.houssem.pcs;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.houssem.pcs.entities.Marque;
import com.houssem.pcs.entities.Pc;
import com.houssem.pcs.repos.PcRepository;

@SpringBootTest
class PcsApplicationTests {

	@Autowired
	private PcRepository PcRepository;
	@Test
	public void testCreatePc() {
		  Pc pc1 = new Pc(
	                "gf63",
	                "i5-11400H",
	                24,
	                512,
	                "Nvidia GeForce GTX 1650",
	                "Windows 10 Professionnel",
	                2900.00,
	                new Date(), // Current date
	                "houssembenjaafar105@gmail.com"
	        );
	        PcRepository.save(pc1);

	        // Create second PC entry
	        Pc pc2 = new Pc(
	                "G5 KF5",
	                "i5-13500H",
	                16,
	                1024,
	                "Nvidia GeForce RTX 4060",
	                "Windows 11 Professionnel",
	                3159.00,
	                new Date(), // Current date
	                "houssembenjaafar109@gmail.com"
	        );
	        PcRepository.save(pc2);
	}
	@Test
	public void testFindPc()
	{
	Pc p = PcRepository.findById(1L).get();
	System.out.println(p);
	}
	@Test
	public void testUpdatePc()
	{
		Pc p = PcRepository.findById(1L).get();
		p.setPrix(1000.0);
		PcRepository.save(p);
	}
	@Test
	public void testDeletePc()
	{
		PcRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousPcs()
	{
		List<Pc>
		pcs = PcRepository.findAll();
		for (Pc p : pcs)
		{
			System.out.println(p);
		}
	}
	@Test
	public void testFindPcByModele()
	{
	List<Pc> pcs = PcRepository.findByModele("GF63");
	for (Pc p : pcs)
	{
		System.out.println(p);
	}
	}
	@Test
	public void testFindPcByModeleContains()
	{
	List<Pc> pcs = PcRepository.findByModeleContains("G");
	for (Pc p : pcs)
	{
		System.out.println(p);
	}
	}
	@Test
	public void testfindByModelePrix()
	{
	List<Pc> pcs = PcRepository.findByModelePrix("GF63",1000.0);
	for (Pc p : pcs)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByCategorie()
	{
	Marque mar = new Marque();
	mar.setIdMarque(1L);
	List<Pc> pcs = PcRepository.findByMarque(mar);
	for (Pc p : pcs)
	{
	System.out.println(p);
	}
	}
	@Test
	public void findByMarqueIdMarque()
	{
	List<Pc> pcs = PcRepository.findByMarqueIdMarque(1L);
	for (Pc p : pcs)
	{
	System.out.println(p);
	}
	 }
	@Test
	public void findByOrderByModeleAsc()
	{
	List<Pc> pcs =PcRepository.findByOrderByModeleAsc();
	for (Pc p : pcs)	
	{
	System.out.println(p);
	}
	}
	@Test
	public void trierModelePrix()
	{
	List<Pc> pcs = PcRepository.trierModelePrix();
	for (Pc p : pcs)
	{
	System.out.println(p);
	}
	}



}
