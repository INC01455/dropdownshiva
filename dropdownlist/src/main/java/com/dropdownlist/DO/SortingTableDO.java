package com.dropdownlist.DO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="SORTING_KEY_TABLE")
public class SortingTableDO {
	
	
	
	@Id
	@GenericGenerator(name = "inc", strategy = "increment")
	@GeneratedValue(generator = "inc")
	@Column(name="SORTING_ID")
	private int id;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name="SORTING_KEY")
	private String key;
	
	@Column(name="SORTING_NAME")
	private String sortingname;

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

	@Override
	public String toString() {
		return "SortingTableDO [id=" + id + ", key=" + key + ", sortingname=" + sortingname + "]";
	}

	/*@Override
	public String toString() {
		return "SortingTableDO [key=" + key + ", sortingname=" + sortingname + "]";
	}*/

	/*public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSortingname() {
		return sortingname;
	}

	public void setSortingname(String sortingname) {
		this.sortingname = sortingname;
	}

	@Override
	public String toString() {
		return "SortingTableDO [id=" + id + ", sortingname=" + sortingname + "]";
	}*/
	
	

}
