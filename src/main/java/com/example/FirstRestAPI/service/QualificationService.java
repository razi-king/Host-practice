package com.example.FirstRestAPI.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.FirstRestAPI.pojo.Qualification;
import com.example.FirstRestAPI.repository.QualificationRepository;

@Service
public class QualificationService {
	@Autowired
	private QualificationRepository qualificationRepository;

	public List<Qualification> getAllQualification() {
		return (List<Qualification>) qualificationRepository.findAll();
	}

	public void addQualif(Qualification q) {
		qualificationRepository.save(q);
		
	}

	public void deleteQualification(int id) {
		qualificationRepository.deleteById(id);
	}

	public Qualification getQualificationById(int id) {
		return qualificationRepository.findById(id).orElse(null);
	}

	public void updateQualification(Qualification q, int id) {
		q.setId(id);
		qualificationRepository.save(q);
	}
}
