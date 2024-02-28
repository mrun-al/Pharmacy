package com.PMS.PharmacyManagement.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PMS.PharmacyManagement.Entity.MyMedicine;
import com.PMS.PharmacyManagement.Repository.MyMedicineRepository;

@Service
public class MyMedicineServices {
	
	@Autowired
	private MyMedicineRepository myMed;
	
	public void saveMyMed(MyMedicine med) {
		myMed.save(med);
	}
}
