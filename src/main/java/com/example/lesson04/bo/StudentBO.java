package com.example.lesson04.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lesson04.dao.StudentDAO;

@Service
public class StudentBO {

	@Autowired
	private StudentDAO studentDAO;

}
