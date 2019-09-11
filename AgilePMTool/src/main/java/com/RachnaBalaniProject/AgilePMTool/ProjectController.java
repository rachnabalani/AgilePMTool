package com.RachnaBalaniProject.AgilePMTool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RachnaBalaniProject.AgilePMTool.domain.Project;
import com.RachnaBalaniProject.AgilePMTool.services.ProjectService;

@RestController
@RequestMapping("/api/project")

public class ProjectController {
	
	@Autowired
	private ProjectService projectService;
	
	@PostMapping("")
	public ResponseEntity<Project> createNewProject(@RequestBody Project project){
	
		Project projectServiceWire = projectService.saveOrUpdateProject(project);
		
		return new ResponseEntity<Project>(project, HttpStatus.CREATED);
	}
	
}
