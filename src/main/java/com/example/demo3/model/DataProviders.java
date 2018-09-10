package com.example.demo3.model;


//import java.util.ArrayList;

public class DataProviders {
	private String date;
	private int value;
//	Title TitleObject;
	
	public DataProviders(String string, int i) {
		this.date=string;
		this.value=i;
		// TODO Auto-generated constructor stub
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	//ArrayList<Data> data = new ArrayList<Data>();

	// Getter Methods

	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}


	



	

