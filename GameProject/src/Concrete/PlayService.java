package Concrete;

import Abstract.IPlayService;
import Entities.Person;
import Entities.Play;

public class PlayService implements IPlayService{

	@Override
	public void sell(Person person, Play play) {
		System.out.println(person.getFirstName() + " " + play.getPlayName() + " isimli oyunu " + play.getPrice() + "TL'ye sattý");
	}

}
