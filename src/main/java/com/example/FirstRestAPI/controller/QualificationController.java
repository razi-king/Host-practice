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

import com.example.FirstRestAPI.pojo.Qualification;
import com.example.FirstRestAPI.service.QualificationService;

@RestController
@RequestMapping("/Qualif")
@CrossOrigin("*")
public class QualificationController {
	@Autowired
	private QualificationService qualificationService;
	@GetMapping("/getQualif")
	public List<Qualification> getAll(){
		return qualificationService.getAllQualification();
	}
	@PostMapping("/saveQualif")
	public void addQualification(@RequestBody Qualification q) {
		qualificationService.addQualif(q);
	}
	@DeleteMapping("/deleteQualif/{id}")
	public void deleteQualification(@PathVariable int id) {
		qualificationService.deleteQualification(id);
	}
	@GetMapping("/getQualifById/{id}")
	public Qualification getQualifById(@PathVariable int id) {
		return qualificationService.getQualificationById(id);
	}
	@PutMapping("/updateQualif/{id}")
	public void updateQualif(@RequestBody Qualification q,@PathVariable int id) {
		 qualificationService.updateQualification(q,id);
	}
		
}
