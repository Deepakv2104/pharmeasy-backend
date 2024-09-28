package com.medicare.pharm_easy.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medicare.pharm_easy.model.Medicine;
import com.medicare.pharm_easy.services.MedicineService;

@RestController
@RequestMapping("/api/v1/medicines")

public class medicines {

	@Autowired
	private MedicineService medicineService;
	
	@PostMapping
	public Medicine addMedicine(@RequestBody Medicine medicine) {
		return medicineService.addMedicine(medicine);
	}
	
	@GetMapping
	public List<Medicine> getMedicine() {
		return medicineService.getMedicines();
	}
	
	@PutMapping("/{id}")
	public Medicine updatMedicine(@PathVariable Long id, @RequestBody Medicine medicine) {
		return medicineService.updateMedicine(id,medicine);
	}
	@DeleteMapping("/{id}")
	public String deleMedicine(@PathVariable Long id, @RequestBody Medicine medicine) {
		return medicineService.deleteMedicine(id, medicine);
	}
}
