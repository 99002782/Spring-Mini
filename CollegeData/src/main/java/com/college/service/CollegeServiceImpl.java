package com.college.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.dao.CollegeRepository;
import com.college.exception.CollegeNotFoundException;
import com.college.model.College;

@Service
public class CollegeServiceImpl implements CollegeService {
    
	@Autowired
    CollegeRepository collegeRepository;

	@Override
	public College getCollegeByCode(Integer code) throws CollegeNotFoundException{
		return collegeRepository.findById(code)
				.orElseThrow(()->new CollegeNotFoundException("College with specified id not found"));
	}
	
	@Override
	public College addCollege(College college) {
		// TODO Auto-generated method stub
		College newCollege=collegeRepository.save(college);
	return newCollege;
}

	@Override
	public Boolean deleteCollege(Integer code) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		 collegeRepository.deleteById(code);
		 return true;
 	}

	@Override
	public List<College> getAllColleges() throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findAll();
	}

	@Override
	public List<College> getCollegeByName(String name) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findByName(name);
	}

	@Override
	public List<College> getByAddressState(String state) throws CollegeNotFoundException {
		// TODO Auto-generated method stub
		return collegeRepository.findByAddressState(state);
	}

//	@Override
//	public List<College> getAddressByState(String state) throws CollegeNotFoundException {
//		// TODO Auto-generated method stub
//		return collegeRepository.findByAddressState(state);
//	}
//
//	@Override
//	public List<College> getStateByAddress(String state) {
//		// TODO Auto-generated method stub
//		return collegeRepository.findByAddressState(state);
//	}

	

//	@Override
//	public List<College> getStateByAddress(String state) throws CollegeNotFoundException {
//		// TODO Auto-generated method stub
//		return collegeRepository.findStateByAddress(state);
//	}

@Override
public College getToatalStu(Integer code) {
//	// TODO Auto-generated method stub
	return collegeRepository.findAllStudents(code);
}

	
	

	
	
	

}
