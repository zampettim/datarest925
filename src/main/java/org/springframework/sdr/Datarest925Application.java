package org.springframework.sdr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.sdr.jpa.Address;
import org.springframework.sdr.jpa.AddressRepository;
import org.springframework.sdr.jpa.Person;
import org.springframework.sdr.jpa.PersonRespository;

@SpringBootApplication
public class Datarest925Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Datarest925Application.class, args);
	}

	@Autowired
	private PersonRespository personRepo;
	
	@Autowired
	private AddressRepository addressRepo;
	
    @Override
    public void run(String... args) throws Exception
    {
        Person person = new Person("Bob", "Bobby", "Likes to Bob");
        person = personRepo.save(person);
        
        Address address = new Address("1234 Line 1 Street", "Apt Line 2", "Somewhere", "NY", "USA", "12345");
        address.setPerson(person);
        address = addressRepo.save(address);
    }
}
