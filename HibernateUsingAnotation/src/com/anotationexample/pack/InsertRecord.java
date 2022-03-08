package com.anotationexample.pack;

import Dal.DatahelperExample;

public class InsertRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatahelperExample.connection();
		Bankeg obj=new Bankeg();
		obj.setId(102);
		obj.setName("Reserve Bank of India");
		DatahelperExample.dmlInsert(obj);
		DatahelperExample.closeconn();
	}

}
