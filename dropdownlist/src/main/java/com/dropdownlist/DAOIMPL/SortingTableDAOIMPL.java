package com.dropdownlist.DAOIMPL;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.dropdownlist.DAO.BaseDao;
import com.dropdownlist.DAO.SortingTableDAO;
import com.dropdownlist.DO.CategeoryTableDO;
import com.dropdownlist.DO.SortingTableDO;
import com.dropdownlist.DTO.SortingTableDTO;

@Repository
public class SortingTableDAOIMPL extends BaseDao implements SortingTableDAO{
	
	public SortingTableDTO ExportFromDO(SortingTableDO sortingTableDO){
		SortingTableDTO sortingTableDTO=new SortingTableDTO();
		//sortingTableDTO.setId(sortingTableDO.getId());
		sortingTableDTO.setKey(sortingTableDO.getKey());
		sortingTableDTO.setSortingname(sortingTableDO.getSortingname());
		
		return sortingTableDTO;
	}
	public SortingTableDO ImportToDB(SortingTableDTO sortingTableDTO){
		SortingTableDO sortingTableDO=new SortingTableDO();
		//sortingTableDO.setId(sortingTableDTO.getId());
		sortingTableDO.setKey(sortingTableDTO.getSortingname());
		sortingTableDO.setSortingname(sortingTableDTO.getSortingname());
		return sortingTableDO;
	}
	
	

	@Override
	public List<SortingTableDTO> fetchSortingNames() {
		// TODO Auto-generated method stub
		StringBuilder str = new StringBuilder();
		List<SortingTableDTO> sortingTableDto=new ArrayList<SortingTableDTO>();
		str.append("from SortingTableDO");
		Query<SortingTableDO> queryy=getSession().createQuery(str.toString());
		List<SortingTableDO> sortingTabledo=queryy.getResultList();
		sortingTabledo.forEach(entityy -> {
			sortingTableDto.add(ExportFromDO(entityy));
		});
		
		
		
		
		
		return sortingTableDto;
	}
	 

}
