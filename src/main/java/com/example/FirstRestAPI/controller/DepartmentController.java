package com.example.FirstRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstRestAPI.pojo.Department;
import com.example.FirstRestAPI.service.DepartmentService;

@RestController
@RequestMapping("/dept")
@CrossOrigin("*")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;
	@GetMapping
	public List<Department> getAll(){
		return departmentService.getAll();
	}
	@PostMapping
	public void addDepartment(@RequestBody Department d) {
		departmentService.addDept(d);
	}
	@DeleteMapping("/{id}")
	public void deleteDepartment(@PathVariable int id) {
		departmentService.deleteDept(id);
	}
	@DeleteMapping
	public void deleteAllDepartment() {
		departmentService.deleteAll();
	}
	@GetMapping("getDeptById/{id}")
	public Department getDept(@PathVariable int id) {
		return departmentService.getDept(id);
	}
	@PutMapping("updateDept/{id}")
	public void updateDept(@RequestBody Department d,@PathVariable int id) {
		d.setId(id);
		departmentService.updateDept(d);
	}
}
