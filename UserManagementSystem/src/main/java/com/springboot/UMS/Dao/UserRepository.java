package com.springboot.UMS.Dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.UMS.bean.User;

public interface UserRepository extends CrudRepository<User, Long> {

	List<User> findAllByuserName(String name);






}
