package com.RachnaBalaniProject.AgilePMTool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.RachnaBalaniProject.AgilePMTool.domain.Project;
import com.RachnaBalaniProject.AgilePMTool.repositories.ProjectRepository;

@Service
public class ProjectService {
	
	@Autowired
	private ProjectRepository projectRepository;
	
	public Project saveOrUpdateProject(Project project) {
		
		//Logic
		
		return projectRepository.save(project);
	}

}
