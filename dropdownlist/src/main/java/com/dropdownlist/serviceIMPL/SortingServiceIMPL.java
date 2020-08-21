package com.dropdownlist.serviceIMPL;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dropdownlist.DAO.SortingTableDAO;
import com.dropdownlist.DTO.SortingTableDTO;
import com.dropdownlist.response.ResponseMessage;
import com.dropdownlist.service.SortingService;



@Service
@Transactional
public class SortingServiceIMPL implements SortingService{
	
	@Autowired
	SortingTableDAO sortingtabledao;

	@Override
	public ResponseMessage fetchSortingNames() {
		// TODO Auto-generated method stub
		ResponseMessage responseMessage=new ResponseMessage();
		try{
			responseMessage.setStatus(Boolean.TRUE);
			responseMessage.setStatusCode(200);
			List<SortingTableDTO> sortingTableDTO=sortingtabledao.fetchSortingNames();
			if(sortingTableDTO.size()==0){
				responseMessage.setMessage("Sortinglist is empty!!");
			}
				else{
					responseMessage.setMessage("Sortinglist is created successfully");
				}
			
			responseMessage.setSortinglist(sortingTableDTO);
		}
		catch(Exception exc){
			responseMessage.setStatusCode(500);
			responseMessage.setStatus(Boolean.FALSE);
		}
		return responseMessage;
	}

}
