package com.example.boot.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.boot.entity.Hospitalclass;

public interface Hospital_repo extends CrudRepository<Hospitalclass, Integer>
{
	Hospitalclass findByName(String name);//findBymethods	
}
