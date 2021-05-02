package Concrete;

import java.util.Date;

import Abstract.IVerification;
import Entities.Person;

public class Verification implements IVerification {

	@Override
	public boolean validate(Person person) {
		if(person.getFirstName() == "Taha" && person.getLastName() == "Kazan" && person.getNationalityId() == "00000000" && person.getBirthDay() == 2000)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}

	
	
}
