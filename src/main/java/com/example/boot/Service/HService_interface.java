package com.example.boot.Service;

import java.util.List;
import java.util.Optional;

import com.example.boot.entity.Hospitalclass;

public interface HService_interface {
	

	public Hospitalclass insert(Hospitalclass hospitalclass);
	
    public List<Hospitalclass> get();
    
	public List<Hospitalclass> deleteById(int id) ;
	
	public Hospitalclass findByName(String name);
	
	public Hospitalclass  update(Hospitalclass hospital);


}
