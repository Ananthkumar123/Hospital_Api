package com.example.boot.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.boot.Service.Hospital_impl;
import com.example.boot.entity.Hospitalclass;

@RestController
@CrossOrigin
public class HospitalController {

	@Autowired
	private Hospital_impl hspl;
	
	@PostMapping("/")
	public String post(@RequestBody Hospitalclass hs ) {
			
		 hspl.insert(hs);
		 return "insertion sucess";
	}
	
	@GetMapping("/")
	public List<Hospitalclass> get()
	{
		return hspl.get();
	}
	
	@DeleteMapping("/d/{id}")
	public String del(@PathVariable int id)
	{
		 hspl.deleteById(id);
		return "deletion sucess";
	
	}
	
	@PutMapping("/p/{name}")
	public Hospitalclass update(@PathVariable String name,@RequestBody Hospitalclass hospital )
	{
		Hospitalclass old_hospital=hspl.findByName(name);
		old_hospital.setName(hospital.getName());
		old_hospital.setGender(hospital.getGender());
		old_hospital.setMobile(hospital.getMobile());
		old_hospital.setAdress(hospital.getAdress());
		old_hospital.setProblem(hospital.getProblem());
		return hspl.update(old_hospital);
	}
	
}
