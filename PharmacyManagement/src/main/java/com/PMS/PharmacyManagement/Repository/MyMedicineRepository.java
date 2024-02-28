package com.PMS.PharmacyManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.PMS.PharmacyManagement.Entity.MyMedicine;

@Repository
public interface MyMedicineRepository extends JpaRepository<MyMedicine,Integer> {
	
	
}
