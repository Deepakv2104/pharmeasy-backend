package com.medicare.pharm_easy.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medicare.pharm_easy.model.Medicine;

@Repository
public interface MedicineRepository extends JpaRepository<Medicine, Long> {

}
