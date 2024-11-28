package com.houssem.pcs.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.houssem.pcs.entities.Pc;
import com.houssem.pcs.service.PcService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class PcRESTController {
	@Autowired
	PcService pcService;
	@RequestMapping(path="all", method = RequestMethod.GET)
	List<Pc>getAllPcs(){
		return pcService.getAllPcs();
		
	}
	@RequestMapping(value="/getbyid/{id}",method = RequestMethod.GET)
	//@GetMapping("/getbyid/{id}")
	public Pc getPcById(@PathVariable("id") Long id) {
	return pcService.getPc(id);
	 }
	
	@RequestMapping(value="/addpc",method = RequestMethod.POST)
	//@PostMapping("/addprod")
	
	public Pc createPc(@RequestBody Pc pc) {
	return pcService.savePc(pc);
	}
	
	@RequestMapping(value="/updatepc",method = RequestMethod.PUT)
	//@PutMapping("/updatepc")
	public Pc updatePc(@RequestBody Pc pc) {
	return pcService.updatePc(pc);
	}
	
	@RequestMapping(value="/delpc/{id}",method = RequestMethod.DELETE)
	//@DeleteMapping("/delpc/{id}")
	public void deletePc(@PathVariable("id") Long id)
	{
		pcService.deletePcById(id);
	}
	
	@RequestMapping(value="/pcsmar/{idMarque}",method = RequestMethod.GET)
	public List<Pc> getPcByMarId(@PathVariable("idMarque") Long idMarque) {
	return pcService.findByMarqueIdMarque(idMarque);
	}

}
