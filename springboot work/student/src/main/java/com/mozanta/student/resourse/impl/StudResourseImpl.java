package com.mozanta.student.resourse.impl;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import com.mozanta.student.domain.Stud;
import com.mozanta.student.resourse.Resourse;
import com.mozanta.student.service.StudService;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins="http://localhost:3000")
public class StudResourseImpl implements Resourse <Stud> {
	
	@Autowired
	private StudService studService;

	@Override
	public ResponseEntity<Collection<Stud>> findAll() {
		// TODO Auto-generated method stub
		return new ResponseEntity<>(studService.findAll(),HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Stud> findById(Long id) {
		// TODO Auto-generated method stub
		return new ResponseEntity<> (studService.findById(id),HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Stud> save(Stud stud) {
		// TODO Auto-generated method stub
		return new ResponseEntity<> (studService.save(stud),HttpStatus.OK);

	}

	@Override
	public ResponseEntity<Stud> update(Stud stud) {
		// TODO Auto-generated method stub
		return new ResponseEntity<> (studService.update(stud),HttpStatus.CREATED);

	}

	@Override
	public ResponseEntity<Stud> deleteById(Long id) {
		// TODO Auto-generated method stub
		return new ResponseEntity<> (studService.findById(id),HttpStatus.OK);

	}

}
