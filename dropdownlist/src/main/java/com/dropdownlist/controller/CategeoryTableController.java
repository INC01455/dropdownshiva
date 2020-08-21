package com.dropdownlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dropdownlist.response.ResponseMessage;
import com.dropdownlist.service.CategeoryService;

@RestController
@RequestMapping("/api")
public class CategeoryTableController {
	
	@Autowired
	CategeoryService categeoryservice;
	
	
	@GetMapping(value="/categeorytablelist")
	public ResponseMessage fetchCategeoryTablelist(){
		return categeoryservice.fetchCategeorytablelist();
	}

}
