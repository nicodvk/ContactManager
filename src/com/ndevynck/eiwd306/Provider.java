package com.ndevynck.eiwd306;

import java.util.ArrayList;
import java.util.List;

import com.ndevynck.eiwd306.classes.Address;
import com.ndevynck.eiwd306.classes.Person;
import com.ndevynck.eiwd306.classes.User;

public class Provider {

	private final static ArrayList<User> usersContext;
	private final static ArrayList<Person> peopleContext;
	private final static ArrayList<String> abilitiesContext;
	
	static{
		usersContext = new ArrayList<User>();
		
		User user;
		
		user = new User();
		user.setLogin("bob.morane@yopmail.com");
		user.setPassword("P@ssword");
		user.setPseudo("BobMorane");
		usersContext.add(user);
		
		user = new User();
		user.setLogin("a");
		user.setPassword("a");
		user.setPseudo("AaaAAaaaAA");
		usersContext.add(user);
		
		user = new User();
		user.setLogin("glop@yopmail.com");
		user.setPassword("P@ssword");
		user.setPseudo("Glop");
		usersContext.add(user);
		
		
		peopleContext = new ArrayList<Person>();
		Person person;
		Address address;
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAvatar("http://png-1.findicons.com/files/icons/1072/face_avatars/300/i04.png");
		person.setEmail("robert@martin.fr");
		person.setAddress(address);
		person.setFirstname("Robert");
		person.setLastname("Martin");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("Developpeur microsoft");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
		person.getAbilities().add("WCF");
		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		
		person.setAddress(address);
		person.setFirstname("George");
		person.setLastname("Durant");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/a02.png");
		person.setEmail("george@durant.fr");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("Developpeur microsoft");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
		person.getAbilities().add("WCF");
		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Michel");
		person.setLastname("Denis");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("michel@denis.fr");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("Developpeur microsoft");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
		person.getAbilities().add("WCF");
		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Frederic");
		person.setLastname("Milano");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/g05.png");
		person.setEmail("frederic@milano.fr");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("Chef de projet technique");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Lisat");
		person.setLastname("Matisse");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("Lisat@matisse.fr");
		person.setMale(false);
		person.setPhoneNumber("0600000000");
		person.setDescription("Chef de projet");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
		person.getAbilities().add("Scrum Master");
		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Tiphaine");
		person.setLastname("Legarek");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("tiphaine@legarek.fr");
		person.setMale(false);
		person.setPhoneNumber("0600000000");
		person.setDescription("Chef de projet technique");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Marc");
		person.setLastname("Vandenbusch");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("marc@vandenbusch.fr");
		person.setMale(false);
		person.setPhoneNumber("0600000000");
		person.setDescription("Chef de projet");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
		person.getAbilities().add("Scrum Master");
		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Gislaine");
		person.setLastname("Gallois");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("gislaine@gallois.fr");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("Comptable");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Audrey");
		person.setLastname("Leval");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("audrey@leval.fr");
		person.setMale(false);
		person.setPhoneNumber("0600000000");
		person.setDescription("Assistante agence");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("John");
		person.setLastname("Gleek");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("john@gleek.fr");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("Directeur agence");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Jean Claude");
		person.setLastname("Convenan");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("jc@convenan.fr");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("Commercial");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Melodie");
		person.setLastname("Galard");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("melodie@galard.fr");
		person.setMale(false);
		person.setPhoneNumber("0600000000");
		person.setDescription("RH");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Alain");
		person.setLastname("Li");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("alain@li.fr");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("RH");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Claire");
		person.setLastname("Pilaud");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("claire@pilaud.fr");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("DRH");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Karim");
		person.setLastname("Balid");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("karim@balid.fr");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("Developpeur microsoft");
		person.getAbilities().add("C#");
		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
//		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		
		address= new Address();
		address.setStreet("6 rue de la corniche");
		address.setZipCode("59000");
		address.setLocality("LILLE");
		
		person = new Person();
		person.setId(peopleContext.size());
		person.setAddress(address);
		person.setFirstname("Antoine");
		person.setLastname("Malle");
		person.setAvatar("http://findicons.com/files/icons/1072/face_avatars/300/i02.png");
		person.setEmail("antoine@malle.fr");
		person.setMale(true);
		person.setPhoneNumber("0600000000");
		person.setDescription("DBA");
//		person.getAbilities().add("C#");
//		person.getAbilities().add(".Net");
//		person.getAbilities().add("WCF");
		person.getAbilities().add("Sql Server");
//		person.getAbilities().add("Office");
//		person.getAbilities().add("Ciel");
//		person.getAbilities().add("Scrum Master");
//		person.getAbilities().add("MS Project");
		peopleContext.add(person);
		
		abilitiesContext = new ArrayList<String>();
		abilitiesContext.add("C#");
		abilitiesContext.add(".Net");
		abilitiesContext.add("WCF");
		abilitiesContext.add("Sql Server");
		abilitiesContext.add("Office");
		abilitiesContext.add("Ciel");
		abilitiesContext.add("Scrum Master");
		abilitiesContext.add("MS Project");
		
	}
	
	
	public static List<User> getAlluser(){
		return new ArrayList<User>(usersContext);
	}
	
	public static User login(String login, String password){
		if(login != null && password != null)
			for(User user : usersContext)
				if(password.equals(user.getPassword()) && login.equals(user.getLogin()))
					return user;
		return null;
	}
	
	public static List<Person> getAllPeople(){
		return new ArrayList<Person>(peopleContext);
	}
	
	public static Person getPersonById(int id){
		for(Person person : peopleContext)
			if(person.getId() == id)
				return person;
		return null;
	}
	
	public static List<Person> searchPerson(String lastname, String firstname){
		List<Person> tofilter = getAllPeople();
		if(lastname != null)
			tofilter = filterByLastname(lastname, tofilter);
		if(firstname != null)
			tofilter = filterByFirstname(firstname, tofilter);
		return tofilter;
	}
	
	private static List<Person> filterByLastname(String lastname, List<Person> people){
		ArrayList<Person> result = new ArrayList<Person>();
		for(Person person : people)
			if(person.getLastname().contains(lastname))
				result.add(person);
		return result;
	}
	
	private static List<Person> filterByFirstname(String firstname, List<Person> people){
		ArrayList<Person> result = new ArrayList<Person>();
		for(Person person : people)
			if(person.getFirstname().contains(firstname))
				result.add(person);
		return result;
	}
}
