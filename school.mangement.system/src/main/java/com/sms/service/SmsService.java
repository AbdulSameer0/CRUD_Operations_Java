package com.sms.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sms.dao.SMSRepositroy;
import com.sms.entity.Student;

@Service
public class SmsService {
    @Autowired
    SMSRepositroy repositroy;
    
    public List<Student> findAll(Student student){
    	ArrayList<Student> list = new ArrayList<>();
    	repositroy.findAll().forEach(list :: add);
    	return list;
    }
    public void insertDate(Student student) {
    	repositroy.save(student);
    }
    public void insertMultipul(List<Student> students) {
    	repositroy.saveAll(students);
    }
    public Optional<Student> findBYId(int id) {
    	 return repositroy.findById(id);
    }
    public void getData(Student student) {
    	repositroy.findAll();
    }
  
    public void deleteBYId(int id) {
    	repositroy.deleteById(id);
    }
    public void updateById(Student student) {
    	repositroy.save(student);
    }
} 
