package com.PMS.PharmacyManagement.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import com.PMS.PharmacyManagement.Entity.MyMedicine;
import com.PMS.PharmacyManagement.Entity.Pharmacy;
import com.PMS.PharmacyManagement.Service.MyMedicineServices;
import com.PMS.PharmacyManagement.Service.PharmacyService;

@Controller
public class PharmacyController {
	
	@Autowired
	private PharmacyService service;
	
	@Autowired
	private MyMedicineServices myMedicine;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
	
	@GetMapping("/services")
	public String services() {
		return "services";
	}
	
	@GetMapping("/aboutUs")
	public String aboutUs() {
		return "aboutUs";
	}
	
	@GetMapping("/contact")
		public String conatct() {
			return "contact";
		}
	
	@GetMapping("/addMedicine")
	public String addMedicine() {
		return "addMedicine";
	}
	
	@GetMapping("/availableMedicine")
	public ModelAndView availableMedicine() {
		List<Pharmacy>list=service.getAll();
		ModelAndView m= new ModelAndView();
		m.setViewName("availableMedicine");
		m.addObject("pharmacy",list);
		return m;
	}
	
	
	@PostMapping("/save")
	public String addMed(@ModelAttribute Pharmacy p) {
		service.save(p);
		return "redirect:/availableMedicine";
	}
	@GetMapping("/updateMedicine")
	public String updateMedicine(){
		return "updateMedicine";
	}
	@RequestMapping("/updateMedicine/{id}")
	public String getMyMedicine(@PathVariable("id") int id) {
		Pharmacy p=service.getMedicineById(id);
		MyMedicine md = new MyMedicine(p.getId(),p.getName(),p.getCompany(),p.getPrice());
		myMedicine.saveMyMed(md);
		return "redirect:/updateMedicine";
	}
	
//	@RequestMapping("/deleteMed/{id}")
//	public String deleteMed(@PathVariable("id")int id) {
//		service.deleteById(id);
//		return "redirect:/updateMedicine";
//	}
}
