package com.github.wlllr;

import com.github.wlllr.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String id) {
        logger.info("Finding person by id");

        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("Weller");
        person.setLastName("Pereira");
        person.setAddress("Campina Grande - PB");
        person.setGender("Male");
        return person;
    }

    public List<Person> findAll() {
        logger.info("Finding all by id's");

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Person person = mockPerson(i);
            people.add(person);
        }

        return people;
    }

    private Person mockPerson(int i) {
        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("Person name " + i);
        person.setLastName("Person lastname " + i);
        person.setAddress("Some place in Brazil");
        person.setGender("Male");
        return person;
    }
}
