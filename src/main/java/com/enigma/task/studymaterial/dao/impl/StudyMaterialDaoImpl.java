package com.enigma.task.studymaterial.dao.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.enigma.task.studymaterial.dao.StudyMaterialDao;
import com.enigma.task.studymaterial.exception.CustomException;
import com.enigma.task.studymaterial.model.StudyMaterial;
import com.enigma.task.studymaterial.repository.StudyMaterialRepository;

public class StudyMaterialDaoImpl extends BaseImpl implements StudyMaterialDao {
	
	@Autowired
	public StudyMaterialRepository repository;

	public StudyMaterial getById(int id) throws CustomException {
		return repository.findById(id).orElse(null);
	}

	public StudyMaterial save(StudyMaterial studyMaterial) throws CustomException {
		return repository.save(studyMaterial);
	}

	public void delete(StudyMaterial studyMaterial) throws CustomException {
		repository.delete(studyMaterial);
		
	}

	public List<StudyMaterial> getList() throws CustomException {
		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<StudyMaterial> query = critB.createQuery(StudyMaterial.class);
		Root<StudyMaterial> root = query.from(StudyMaterial.class);
		query.select(root);
		
		TypedQuery<StudyMaterial> i = em.createQuery(query);
		
		return i.getResultList();
	}

	public List<StudyMaterial> getListByActiveFlag() throws CustomException {

		CriteriaBuilder critB = em.getCriteriaBuilder();
		CriteriaQuery<StudyMaterial> query = critB.createQuery(StudyMaterial.class);
		Root<StudyMaterial> root = query.from(StudyMaterial.class);
		query = query.select(root)
				.where(critB.equal(root.get("activeFlag"), 1));
		
		TypedQuery<StudyMaterial> i = em.createQuery(query);
		
		return i.getResultList();
	}

}
