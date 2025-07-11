package com.example.FirstRestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstRestAPI.pojo.Department;
import com.example.FirstRestAPI.repository.DepartmentRepository;

@Service
public class DepartmentService {
	@Autowired
	private DepartmentRepository departmentRepository;

	public List<Department> getAll() {		
		return (List<Department>)departmentRepository.findAll();
	}

	public void addDept(Department d) {
		departmentRepository.save(d);
	}

	public void deleteDept(int id) {
		departmentRepository.deleteById(id);
	}

	public Department getDept(int id) {
		return departmentRepository.findById(id).orElse(null);
	}

	public void updateDept(Department d) {
		departmentRepository.save(d);
	}

	public void deleteAll() {
		departmentRepository.deleteAll();
		
	}
	
}
