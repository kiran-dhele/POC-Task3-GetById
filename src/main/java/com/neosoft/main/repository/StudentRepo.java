package com.neosoft.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.main.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer>{

	public Student findById(int id);
}
