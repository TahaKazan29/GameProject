package Abstract;

import Entities.Person;

public interface IGamerService {

	void add(Person person);
	void update(Person person);
	void delete(Person person);
}
