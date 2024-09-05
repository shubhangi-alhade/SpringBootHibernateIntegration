package com.tka.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tka.entity.Classroom;

@Repository
public class ClassroomDao {
	
@Autowired
SessionFactory factory;

public Classroom fetchClassroom(int clsId)
{
	//hibernate code goes here
	System.err.println("I have reached to dao layer............ ");
	Session session= factory.openSession();
	Classroom classroom= session.load(Classroom.class, clsId);
	System.out.println(classroom);
	return classroom;
}
}
