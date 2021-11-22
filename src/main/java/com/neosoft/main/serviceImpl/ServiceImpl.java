package com.neosoft.main.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neosoft.main.model.Student;
import com.neosoft.main.repository.StudentRepo;
import com.neosoft.main.serviceInterf.ServiceInterf;

@Service
public class ServiceImpl implements ServiceInterf{

	@Autowired
	StudentRepo studentRepo;
	
	@Override
	public Student getStudentById(int id) {

   Student student= studentRepo.findById(id);
		return student;
	}

}
