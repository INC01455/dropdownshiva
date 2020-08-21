package com.dropdownlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dropdownlist.response.ResponseMessage;
import com.dropdownlist.service.SortingService;

@RestController
@RequestMapping("/api")
public class SortingTableController {
	
	@Autowired
	SortingService sortingservice;
	
	@GetMapping(value="/sortingnames")
	public ResponseMessage fetchSortingNames(){
		return sortingservice.fetchSortingNames();
	}
	
	

}
