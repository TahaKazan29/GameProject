package Concrete;

import Abstract.IGamerService;
import Abstract.IVerification;
import Entities.Person;

public class GamerService implements IGamerService{

	IVerification _verification;
	
	public GamerService(IVerification verification) {
		super();
		this._verification = verification;
	}

	
	@Override
	public void add(Person person) {
		if(_verification.validate(person)) {
			System.out.println(person.getFirstName() + " Kay�t oldu");
		}
		else {
			System.out.println("Do�rulama Ba�ar�s�z Kay�t olu�turulamad�");
		}
		
	}

	@Override
	public void update(Person person) {
		System.out.println(person.getFirstName() + " Kay�d� Silindi");
		
	}

	@Override
	public void delete(Person person) {
		System.out.println(person.getFirstName() + " Kay�d� G�ncellendi");
	}
	
	
	
}
