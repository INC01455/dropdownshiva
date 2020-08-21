package com.dropdownlist.DTO;

public class CategeoryTableDTO {
	
	private int id;
	private String categeoryname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategeoryname() {
		return categeoryname;
	}
	public void setCategeoryname(String categeoryname) {
		this.categeoryname = categeoryname;
	}
	@Override
	public String toString() {
		return "CategeoryTableDTO [id=" + id + ", categeoryname=" + categeoryname + "]";
	}
	public CategeoryTableDTO(int id, String categeoryname) {
		super();
		this.id = id;
		this.categeoryname = categeoryname;
	}
	
	public CategeoryTableDTO(){
		
	}

}
