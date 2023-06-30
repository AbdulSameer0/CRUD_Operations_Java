package com.sms.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sms.entity.Student;

@Repository
public interface SMSRepositroy extends CrudRepository<Student, Integer>{
     
}
