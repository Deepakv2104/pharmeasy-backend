package com.medicare.pharm_easy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.medicare.pharm_easy.exceptions.ResourceNotFoundException;
import com.medicare.pharm_easy.model.Medicine;
import com.medicare.pharm_easy.repositories.MedicineRepository;

@Service
public class MedicineService {
	
	@Autowired
	private MedicineRepository medicineRepository;

	public Medicine addMedicine(Medicine medicine) {
		return medicineRepository.save(medicine);
	}
  
	public List<Medicine> getMedicines() {
		return medicineRepository.findAll();
	}

	public Medicine updateMedicine(Long id, Medicine medicine) {
	    return medicineRepository.findById(id).map(existingMedicine -> {
	        existingMedicine.setName(medicine.getName());
	        existingMedicine.setManufacturer(medicine.getManufacturer());
	        existingMedicine.setPrice(medicine.getPrice());
	        existingMedicine.setExpiryDate(medicine.getExpiryDate());
	        existingMedicine.setStockQuantity(medicine.getStockQuantity());
	        
	        return medicineRepository.save(existingMedicine);
	    }).orElseThrow(() -> new ResourceNotFoundException("Medicine not found with id: " + medicine.getId()));
	}
	public String deleteMedicine(Long id, Medicine medicine) {
		medicineRepository.deleteById(id);
		return "Deleted successfully";
	}
}
