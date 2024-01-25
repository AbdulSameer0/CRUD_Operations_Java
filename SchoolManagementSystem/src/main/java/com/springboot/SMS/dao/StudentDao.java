package com.springboot.SMS.dao;

import org.springframework.data.repository.CrudRepository;
import com.springboot.SMS.Entity.Student;
public interface StudentDao extends CrudRepository<Student, Integer>{

}
