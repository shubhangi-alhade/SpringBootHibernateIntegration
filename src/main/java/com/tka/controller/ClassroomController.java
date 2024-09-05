package com.tka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.tka.entity.Classroom;
import com.tka.service.ClassroomService;

@RestController
public class ClassroomController {

	@Autowired	
	ClassroomService classroomService;
	
	@GetMapping("getclassroom/{clsid}")
	public Classroom fetchClassroom(@PathVariable("clsid") int clsId) 
	{
		System.err.println(clsId);
	Classroom classroom = classroomService.fetchClassroom(clsId);
	return classroom;
	}
}
