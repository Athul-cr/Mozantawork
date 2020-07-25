package com.mozanta.student.service.Impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.mozanta.student.domain.Stud;
import com.mozanta.student.service.StudService;
@Service
public  class StudServiceImpl implements StudService {

	private Long studId =100L;
	private Map<Long , Stud> studMap =new HashMap<Long,Stud>();
	{
		Stud stud =new Stud();
		stud.setId(studId);
		stud.setName("Athul");
		stud.setDob(1997);
		stud.setClasss("x");
		stud.setDivision("B");
		stud.setGender("Male");
		studMap.put(stud.getId(),stud);
	}
	
	
	
	
	@Override
	public Collection<Stud> findAll() {
		// TODO Auto-generated method stub
		return studMap.values();
	}

	public Stud findById(Long id) {
		// TODO Auto-generated method stub
		return studMap.get(id);
	}

	public Stud save(Stud stud) {
		// TODO Auto-generated method stub
		Long newStudId = ++studId;
		stud.setId(newStudId);
		studMap.put(stud.getId(),stud);
		return studMap.get(newStudId);
	}

	@Override
	public Stud update(Stud stud) {
		// TODO Auto-generated method stub
		studId=stud.getId();
		if(studMap.get(studId)!= null ) {
			studMap.put(studId, stud);
			return studMap.get(studId);
		}
		return null;
	}

	@Override
	public Stud deleteById(Long id) {
		// TODO Auto-generated method stub
		if(studMap.get(id)!= null) {
			return studMap.remove(id);
		}
		return null;
	}

}

