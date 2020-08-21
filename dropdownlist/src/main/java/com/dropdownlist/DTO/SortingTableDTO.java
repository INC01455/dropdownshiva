package com.dropdownlist.DTO;

public class SortingTableDTO {
	
	/*private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}*/

	private String key;
	private String sortingname;
	
	public SortingTableDTO(){
		
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getSortingname() {
		return sortingname;
	}

	public void setSortingname(String sortingname) {
		this.sortingname = sortingname;
	}

	/*public SortingTableDTO(int id, String key, String sortingname) {
		super();
		this.id = id;
		this.key = key;
		this.sortingname = sortingname;
	}

	@Override
	public String toString() {
		return "SortingTableDTO [id=" + id + ", key=" + key + ", sortingname=" + sortingname + "]";
	}*/

	@Override
	public String toString() {
		return "SortingTableDTO [key=" + key + ", sortingname=" + sortingname + "]";
	}

	public SortingTableDTO(String key, String sortingname) {
		super();
		this.key = key;
		this.sortingname = sortingname;
	}
	
	
	/*public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSortingname() {
		return sortingname;
	}
	public void setSortingname(String sortingname) {
		this.sortingname = sortingname;
	}
	public SortingTableDTO(int id, String sortingname) {
		super();
		this.id = id;
		this.sortingname = sortingname;
	}
	@Override
	public String toString() {
		return "SortingTableDTO [id=" + id + ", sortingname=" + sortingname + "]";
	}*/

	

}
