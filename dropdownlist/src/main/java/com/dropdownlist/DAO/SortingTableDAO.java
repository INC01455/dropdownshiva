package com.dropdownlist.DAO;

import java.util.List;

import com.dropdownlist.DTO.SortingTableDTO;

public interface SortingTableDAO {

	List<SortingTableDTO> fetchSortingNames();

}
