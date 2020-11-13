package com.college.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.college.model.College;

@Repository
public interface CollegeRepository extends MongoRepository<College,Integer>{
College findByCode(Integer code);
List<College> findByAddressState(String state);
List<College> findByName(String name);
College findAllStudents(Integer code);
//College findAllStudents(Integer code);

//@Query("{'totalstu':{$gt:?1000}}")
//List<College>findTotalStu(String collegename);
}
