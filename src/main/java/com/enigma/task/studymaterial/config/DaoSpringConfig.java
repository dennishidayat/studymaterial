package com.enigma.task.studymaterial.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.enigma.task.studymaterial.dao.StudyMaterialDao;
import com.enigma.task.studymaterial.dao.impl.StudyMaterialDaoImpl;


@Configuration
public class DaoSpringConfig {
	@Bean
	public StudyMaterialDao studyMaterialDao() {
		return new StudyMaterialDaoImpl();
	}
	
	@Bean
    public ModelMapper modelMapper() {
    	return new ModelMapper();
    }

}
