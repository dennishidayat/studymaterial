package com.enigma.task.studymaterial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="study_material")
public class StudyMaterial {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="material_id")
	private int materialId;
	@Column(name="description")
	private String description;
	@Column(name="active_flag")
	private Boolean activeFlag;
	
	public StudyMaterial(int materialId, String description, Boolean activeFlag) {
		this.materialId = materialId;
		this.description = description;
		this.activeFlag = activeFlag;
	}
	
	public int getMaterialId() {
		return materialId;
	}

	public void setMaterialId(int materialId) {
		this.materialId = materialId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public StudyMaterial() {}
	
	
}
