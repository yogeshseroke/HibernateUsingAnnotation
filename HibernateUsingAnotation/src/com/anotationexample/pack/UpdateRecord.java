package com.anotationexample.pack;

import Dal.DatahelperExample;

public class UpdateRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatahelperExample.connection();
		Bankeg obj=new Bankeg();
		obj.setId(101);
		obj.setName("Bank of India");
		DatahelperExample.dmlUpdate(obj);
		DatahelperExample.closeconn();
	}

}
