package com.mozanta.student.service;

import java.util.Collection;

import com.mozanta.student.domain.Stud;
public interface StudService {
	
	Collection<Stud> findAll();
	Stud findById(Long id);
	Stud save(Stud stud);
	Stud update(Stud stud);
	Stud deleteById(Long id);

		
}



