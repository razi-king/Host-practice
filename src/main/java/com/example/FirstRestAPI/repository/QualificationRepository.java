package com.example.FirstRestAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FirstRestAPI.pojo.Qualification;

@Repository
public interface QualificationRepository extends CrudRepository<Qualification, Integer>{

}
