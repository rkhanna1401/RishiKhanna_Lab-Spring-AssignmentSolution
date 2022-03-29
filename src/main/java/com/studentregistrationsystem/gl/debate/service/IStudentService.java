package com.studentregistrationsystem.gl.debate.service;

import java.util.List;

import com.studentregistrationsystem.gl.debate.entity.Student;

public interface IStudentService {

	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student st);

	public void deleteById(int theId);

	public List<Student> searchBy(String name, String id);

}
