package com.example.boot.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.boot.Dao.Hospital_repo;
import com.example.boot.entity.Hospitalclass;

@Service
public class Hospital_impl implements HService_interface {

	@Autowired
	private Hospital_repo repo;
	
	@Override
	public Hospitalclass insert( Hospitalclass hsc) {
		
		return repo.save(hsc);
	}
    public List<Hospitalclass> get(){
	 
    	return (List<Hospitalclass>) repo.findAll();
   }
	@Override
	public List<Hospitalclass> deleteById(int id) {
		
		 repo.deleteById(id);
		 return null;
		
 
 	}
	@Override
	public Hospitalclass findByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name);
	}
	@Override
	public Hospitalclass update(Hospitalclass hospital) {
		
		return repo.save(hospital);
	}
	 
	
     
}
