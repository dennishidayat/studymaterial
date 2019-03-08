package com.enigma.task.studymaterial.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.enigma.task.studymaterial.model.StudyMaterial;


public interface StudyMaterialRepository extends PagingAndSortingRepository<StudyMaterial, Integer> {
	
}
