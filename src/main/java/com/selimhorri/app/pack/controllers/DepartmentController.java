package com.selimhorri.app.pack.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.selimhorri.app.pack.services.DepartmentService;

@Controller
@RequestMapping(value = {"/app/departments"})
public class DepartmentController {
	
	private final DepartmentService service;
	private static final Logger logger = LoggerFactory.getLogger(DepartmentController.class);
	
	static {
		logger.info("************ entering " + DepartmentController.class.getName() + " ************");
	}
	
	@Autowired
	public DepartmentController(final DepartmentService service) {
		this.service = service;
	}
	
	@GetMapping(value = {"/departments-list"})
	public String displayDepartmentsList(final Model model) {
		model.addAttribute("departments", this.service.findAll());
		return "departments/departments-list";
	}
	
	@GetMapping(value = {"/departments-edit"})
	public String displayDepartmentsEdit() {
		return "departments/departments-edit";
	}
	
	
	
}









