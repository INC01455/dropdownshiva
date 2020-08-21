package com.dropdownlist.DAOIMPL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.dropdownlist.DAO.BaseDao;
import com.dropdownlist.DAO.CategeoryTableDAO;
import com.dropdownlist.DO.CategeoryTableDO;
import com.dropdownlist.DTO.CategeoryTableDTO;


@Repository
public class CategeoryTableDAOIMPL extends BaseDao implements CategeoryTableDAO{
	
	public CategeoryTableDO ImportToDB(CategeoryTableDTO categeoryTableDTO){
		CategeoryTableDO categeoryTableDO=new CategeoryTableDO();
		categeoryTableDO.setId(categeoryTableDTO.getId());
		categeoryTableDO.setCategeoryname(categeoryTableDTO.getCategeoryname());
		
		
		return categeoryTableDO;
	}
	public CategeoryTableDTO ExportFromDB(CategeoryTableDO categeoryTableDO){
		CategeoryTableDTO categeoryTableDTO=new CategeoryTableDTO();
		categeoryTableDTO.setId(categeoryTableDO.getId());
		categeoryTableDTO.setCategeoryname(categeoryTableDO.getCategeoryname());
		
		
		return categeoryTableDTO;
	}
	
	
	
	

	@Override
	public List<CategeoryTableDTO> fetchCategeorytablelist() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		List<CategeoryTableDTO> categeoryTableDTo=new ArrayList<CategeoryTableDTO>();
		str.append("from CategeoryTableDO");
		Query<CategeoryTableDO> DO=getSession().createQuery(str.toString());
		List<CategeoryTableDO> categeoryTableDo=DO.getResultList();
		categeoryTableDo.forEach(entity -> {
			categeoryTableDTo.add(ExportFromDB(entity));
		});
		//categeoryTableDTo.add(ExportFromDB())
		return categeoryTableDTo;
	}

}
