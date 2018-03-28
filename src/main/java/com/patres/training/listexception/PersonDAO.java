package com.patres.training.listexception;

public class PersonDAO {

	private volatile static PersonDAO instance;

	public static final PersonDAO getInstance() {
		if (instance == null) {
			synchronized (PersonDAO.class) {
				if (instance == null) {
					instance = new PersonDAO();
				}
			}
		}
		return instance;
	}

	public void validate(Person person) throws ApplicationException {
		if (person.getAge() < 18) {
			throw new ApplicationException("Too young");
		}

		if (person.getName() == null) {
			throw new ApplicationException("Name cannot be empty");
		}

		if (!person.isHappy()) {
			throw new ApplicationException("Be happy!");
		}
	}
}
