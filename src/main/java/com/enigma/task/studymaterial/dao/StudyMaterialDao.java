package com.enigma.task.studymaterial.dao;

import java.util.List;

import com.enigma.task.studymaterial.exception.CustomException;
import com.enigma.task.studymaterial.model.StudyMaterial;


public interface StudyMaterialDao {
	public StudyMaterial getById(int id) throws CustomException;
	public StudyMaterial save(StudyMaterial studyMaterial) throws CustomException;
	void delete(StudyMaterial studyMaterial) throws CustomException;
	
	List<StudyMaterial> getList() throws CustomException;
	List<StudyMaterial> getListByActiveFlag() throws CustomException;
}
