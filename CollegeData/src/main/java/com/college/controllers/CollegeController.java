package com.college.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.college.exception.CollegeNotFoundException;
import com.college.model.College;
import com.college.service.CollegeService;
@RestController
@RequestMapping("/college-api")
public class CollegeController {
@Autowired
CollegeService collegeService;
@PostMapping("/colleges")
College addCollege(@RequestBody College college) {
	return collegeService.addCollege(college);
}
@GetMapping("/colleges")
List<College> getAllColleges(){
	return collegeService.getAllColleges();
}
@DeleteMapping("/colleges/delete-one/{code}")
boolean deleteCollege(@PathVariable("code")Integer code) throws CollegeNotFoundException{
	return collegeService.deleteCollege(code);
}
College getCollegeByCode("/colleges/get-college/{code}") {
	return collegeService.getCollegeByCode(code);
}

@GetMapping("/colleges/get-one/{state}")
List<College> getCollegeByState(@PathVariable("state")String state) throws CollegeNotFoundException{
	return collegeService.getByAddressState(state);
}
}
//@GetMapping("/colleges/page/{page}")
//List<College> getCollegeByName(@PathVariable("page")String page)throws CollegeNotFoundException{
//	return collegeService.getCollegeByName(page);



