package com.dropdownlist.serviceIMPL;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dropdownlist.DAO.CategeoryTableDAO;
import com.dropdownlist.DTO.CategeoryTableDTO;
import com.dropdownlist.response.ResponseMessage;
import com.dropdownlist.service.CategeoryService;


@Service
@Transactional
public class CategeoryServiceIMPL implements CategeoryService{
	
	@Autowired
	CategeoryTableDAO categeorytabledao;

	@Override
	public ResponseMessage fetchCategeorytablelist() {
		// TODO Auto-generated method stub
		ResponseMessage responseMessage=new ResponseMessage();
		try{
			responseMessage.setStatus(Boolean.TRUE);
			responseMessage.setStatusCode(200);
			List<CategeoryTableDTO> categeoryTabledtolist=categeorytabledao.fetchCategeorytablelist();
			if(categeoryTabledtolist.size()==0){
				responseMessage.setMessage("categeorytable is empty!");
			}
			else{
			responseMessage.setMessage("listing of categeorytable is successfull");
			}
			responseMessage.setList(categeoryTabledtolist);
		}
		catch(Exception exc){
			responseMessage.setStatusCode(500);
			responseMessage.setStatus(Boolean.FALSE);
		}
		
		
		
		
		return responseMessage;
	}

}
