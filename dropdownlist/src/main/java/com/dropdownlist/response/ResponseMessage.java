package com.dropdownlist.response;

import java.util.List;

import com.dropdownlist.DTO.CategeoryTableDTO;
import com.dropdownlist.DTO.SortingTableDTO;



public class ResponseMessage {
	
	private boolean status;
	private String message;
	private Integer statusCode;
	private Object data;
	private List<Object> datalist;
	private List<CategeoryTableDTO> list;
	private List<SortingTableDTO> sortinglist;
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public List<Object> getDatalist() {
		return datalist;
	}
	public void setDatalist(List<Object> datalist) {
		this.datalist = datalist;
	}
	public List<CategeoryTableDTO> getList() {
		return list;
	}
	public void setList(List<CategeoryTableDTO> list) {
		this.list = list;
	}
	
	
	public List<SortingTableDTO> getSortinglist() {
		return sortinglist;
	}
	public void setSortinglist(List<SortingTableDTO> sortinglist) {
		this.sortinglist = sortinglist;
	}
	public ResponseMessage(){
		
	}
	public ResponseMessage(boolean status, String message, Integer statusCode, Object data, List<Object> datalist,
			List<CategeoryTableDTO> list, List<SortingTableDTO> sortinglist) {
		super();
		this.status = status;
		this.message = message;
		this.statusCode = statusCode;
		this.data = data;
		this.datalist = datalist;
		this.list = list;
		this.sortinglist = sortinglist;
	}
	@Override
	public String toString() {
		return "ResponseMessage [status=" + status + ", message=" + message + ", statusCode=" + statusCode + ", data="
				+ data + ", datalist=" + datalist + ", list=" + list + ", sortinglist=" + sortinglist + "]";
	}
	
}
