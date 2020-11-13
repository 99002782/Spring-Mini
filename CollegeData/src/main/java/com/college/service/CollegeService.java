package com.college.service;
import java.util.List;

import com.college.exception.CollegeNotFoundException;
import com.college.model.College;
public interface CollegeService {
	College getCollegeByCode(Integer code) throws CollegeNotFoundException;
    College addCollege(College college);
    Boolean deleteCollege(Integer code) throws CollegeNotFoundException;
    List<College> getAllColleges() throws CollegeNotFoundException;
 
    List<College> getCollegeByName(String name) throws CollegeNotFoundException;
  List <College> getByAddressState(String state) throws CollegeNotFoundException;
	College getToatalStu(Integer code);
//List<College> getStateByAddress(String state);
}
