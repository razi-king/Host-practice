package com.example.FirstRestAPI.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FirstRestAPI.pojo.Emp;

@Repository
public interface EmpRepository extends CrudRepository<Emp, Integer> {
	List<Emp> findByName(String name);
	List<Emp> findByEmail(String email);
	void deleteByName(String name);
	void deleteByEmail(String email);
	Emp findByNameAndEmail(String name, String email);
	Emp findByEmailAndPassword(String email, String password);
	List<Emp> findByNameAndPassword(String name,String password);
	List<Emp> findByNameOrPassword(String name, String password);
	List<Emp> findByAgeLessThan(int age);
	List<Emp> findByAgeLessThanEqual(int age);
	List<Emp> findByAgeGreaterThan(int age);
	List<Emp> findByAgeGreaterThanEqual(int age);
	List<Emp> findByIdIn(List<Integer> id);
}
