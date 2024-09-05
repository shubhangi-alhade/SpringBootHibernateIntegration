package com.tka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.dao.ClassroomDao;
import com.tka.entity.Classroom;

@Service
public class ClassroomService {

	@Autowired
	ClassroomDao classroomDao;
	
	public Classroom fetchClassroom(int clsId)
	{
		return classroomDao.fetchClassroom(clsId);
	}

}

