package com.patres.training.listexception;

public class ListExceptionApp {


	public static void main(String[] args) {
		Person person = new Person();
		try {
			PersonDAO.getInstance().validate(person);
		} catch (ApplicationException e) {
			e.printStackTrace();
		}
	}


}
