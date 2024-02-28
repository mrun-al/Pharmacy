package com.PMS.PharmacyManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PMS.PharmacyManagement.Entity.Pharmacy;
import com.PMS.PharmacyManagement.Repository.PharmacyRepository;

@Service
public class PharmacyService {
	
	@Autowired
	private PharmacyRepository pRepo;
	
	
	
	public void save(Pharmacy p) {
		pRepo.save(p);
	}
	public List<Pharmacy> getAll(){
		return pRepo.findAll();
	}
	public Pharmacy getMedicineById(int id) {
		return pRepo.findById(id).get();		
	}
	
	public void deleteById(int id) {
		pRepo.deleteById(id);
	}
}
