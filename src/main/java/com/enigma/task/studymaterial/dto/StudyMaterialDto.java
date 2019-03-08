package com.enigma.task.studymaterial.dto;

public class StudyMaterialDto {
	private Integer materialId;
	private String description;
	private Boolean activeFlag;
	
	public StudyMaterialDto(Integer materialId, String description, Boolean activeFlag) {
		this.materialId = materialId;
		this.description = description;
		this.activeFlag = activeFlag;
	}

	public StudyMaterialDto() {}
	
	public Integer getMaterialId() {
		return materialId;
	}

	public void setMaterialId(Integer materialId) {
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
}
