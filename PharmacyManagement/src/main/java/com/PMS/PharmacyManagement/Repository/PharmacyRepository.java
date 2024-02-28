package com.PMS.PharmacyManagement.Repository;
import com.PMS.PharmacyManagement.Entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PharmacyRepository extends JpaRepository<Pharmacy,Integer> {

}
