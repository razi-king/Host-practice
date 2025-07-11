package com.example.FirstRestAPI.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FirstRestAPI.pojo.Department;

@Repository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {

}
