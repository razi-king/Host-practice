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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.FirstRestAPI.pojo.Emp;
import com.example.FirstRestAPI.pojo.User;
import com.example.FirstRestAPI.service.EmpService;

@RestController
@RequestMapping("Emp")
@CrossOrigin("*")
public class EmpController {
	@Autowired
	EmpService empService;
	@PostMapping("/saveEmp")
	private void addUser(@RequestBody Emp emp) {
		empService.addUser(emp);
	}
	@GetMapping
	public String  home() {
		return "Welcome";
	}
	@GetMapping("/emp")
	public List<Emp> getAllUser(){
		return empService.getAllUser();
	}
	@GetMapping("/email/{email}")
	public List<Emp> getEmpByEmail(@PathVariable String email ) {
		return empService.getEmpByEmail(email);
	}
	@GetMapping("/name/{name}")
	public List<Emp> getEmpByName(@PathVariable String name){
		return empService.getEmpByName(name);
	}
	
	@GetMapping("getEmpById/{id}")
	public Emp getEmpById(@PathVariable int id) {
		return empService.getEmpById(id);
	}
	@PutMapping("update/{id}")
	public String updateEmp(@PathVariable int id,@RequestBody Emp emp) {
		emp.setId(id);
		empService.addUser(emp);
		return "Success";
	}
	@DeleteMapping("delete/{id}")
	public String getDelete(@PathVariable int id) {
		empService.deleteEmp(id);
		return "Success";
	}
	@DeleteMapping("deleteByName/{name}")
	public String getDelete(@PathVariable String name) {
		empService.deleteEmpByName(name);
		return "Success";
	}
	@DeleteMapping("deleteByEmail/{email}")
	public String deleteEmpByEmail(@PathVariable String email) {
		empService.deleteEmpByEmail(email);
		System.out.println(email);
		
		return "Delete By Email Success";
	}
	@GetMapping("findByNameAndEmail/{name}/{email}")
	public Emp findByNameAndEmail(@PathVariable String name, @PathVariable String email) {
		return empService.getEmpByNameAndEmail(name,email);
	}
	@GetMapping("findByEmailAndPassword/{email}/{password}")
	public Emp findByEmailAndPassword(@PathVariable String email,@PathVariable String password) {
		return empService.getEmpByEmailAndPassword(email, password);
	}
	@GetMapping("findByNameAndPassword/{name}/{password}")
	public List<Emp> findByNameAndPassword(@PathVariable String name,@PathVariable String password) {
		return empService.getEmpByNameAndPassword(name, password);
	}
	@GetMapping("findByNameorPassword/{name}/{password}")
	public List<Emp> findByNameorPassword(@PathVariable String name,@PathVariable String password) {
		return empService.getEmpByNameorPassword(name, password);
	}
	@GetMapping("findByAgeLessThan/{age}")
	public List<Emp> findByAgeLessThan(@PathVariable int age){
		return empService.findByAgeLessThan(age);
	}
	@GetMapping("findByAgeLessThanEqual/{age}")
	public List<Emp> findByAgeLessThanEqual(@PathVariable int age){
		return empService.findByAgeLessThanEqual(age);
	}
	@GetMapping("findByAgeGreaterThan/{age}")
	public List<Emp> findByAgeGreaterThan(@PathVariable int age){
		return empService.findByAgeGreaterThan(age);
	}
	@GetMapping("findByAgeGreaterThanEqual/{age}")
	public List<Emp> findByAgeGreaterThanEqual(@PathVariable int age){
		return empService.findByAgeGreaterThanEqual(age);
	}
	@GetMapping("findByIdIn")
	public List<Emp> findByIdIn(@RequestParam List<Integer>id){
		return empService.findByIn(id);
	}
}
