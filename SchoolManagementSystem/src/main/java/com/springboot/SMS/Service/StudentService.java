package com.springboot.SMS.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springboot.SMS.Entity.Student;
import com.springboot.SMS.dao.StudentDao;

@Service
public class StudentService {
      @Autowired
      private StudentDao studentDao;
      
      public List<Student> getbook(){
    	   List<Student> list = new ArrayList<>();
    	   studentDao.findAll().forEach(list :: add);
		return list;
    	  
      }
      
      public void addStudent(Student student) {
    	  studentDao.save(student);
      }
      
 
      
      
}
