package com.dropdownlist.DO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="CATEGEORY_TABLE")
public class CategeoryTableDO {
	
	@Id
	@Column(name="CATEGEORY_ID")
	@GenericGenerator(name = "inc", strategy = "increment")
	@GeneratedValue(generator = "inc")
	private int id;
	
	
	
	@Column(name="CATEGEORY_NAME")
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
		return "CategeoryTableDO [id=" + id + ", categeoryname=" + categeoryname + "]";
	}
	
	
	
	
	

}
