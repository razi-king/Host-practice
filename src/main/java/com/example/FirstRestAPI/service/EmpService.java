package com.example.FirstRestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstRestAPI.pojo.Emp;
import com.example.FirstRestAPI.pojo.User;
import com.example.FirstRestAPI.repository.EmpRepository;

import jakarta.transaction.Transactional;

@Service
public class EmpService {
	@Autowired
	EmpRepository empRepository;

	public void addUser(Emp emp) {
		empRepository.save(emp);
		
	}

	public List<Emp> getAllUser() {
		return (List<Emp>)empRepository.findAll();
	}

	public Emp getEmpById(int id) {
		return empRepository.findById(id).get();
	}

	public void deleteEmp(int id) {
		
		empRepository.deleteById(id);
	}

	public List<Emp> getEmpByEmail(String email) {
		return  empRepository.findByEmail(email);
		
	}

	public List<Emp> getEmpByName(String name) {
		
		return empRepository.findByName(name);
	}

	public void deleteEmpByName(String name) {
		empRepository.deleteByName(name);
		
	}
	@Transactional
	public void deleteEmpByEmail(String email) {
		empRepository.deleteByEmail(email);
	}

	public Emp getEmpByNameAndEmail(String name, String email) {
		return empRepository.findByNameAndEmail(name,email);
	}
	public Emp getEmpByEmailAndPassword(String email,String password) {
		return empRepository.findByEmailAndPassword(email, password);
				
	}
	public List<Emp>getEmpByNameAndPassword(String name,String password){
		return empRepository.findByNameAndPassword(name, password);
	}

	public List<Emp> getEmpByNameorPassword(String name, String password) {
		
		return empRepository.findByNameOrPassword(name, password);
	}

	public List<Emp> findByAgeLessThan(int age) {
		return empRepository.findByAgeLessThan(age);
	}
	public List<Emp> findByAgeLessThanEqual(int age) {
		return empRepository.findByAgeLessThanEqual(age);
	}
	public List<Emp> findByAgeGreaterThan(int age) {
		return empRepository.findByAgeGreaterThan(age);
	}
	public List<Emp> findByAgeGreaterThanEqual(int age) {
		return empRepository.findByAgeGreaterThanEqual(age);
	}

	public List<Emp> findByIn(List<Integer> id) {
		return empRepository.findByIdIn(id);
	}
}
