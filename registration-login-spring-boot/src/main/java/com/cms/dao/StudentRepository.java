package com.cms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	   List<Student> findByName(String name); 

}
