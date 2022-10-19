package com.spring.hibernate.app.service;

import com.spring.hibernate.app.entity.Person;
import com.spring.hibernate.app.request.PersonRequest;
import com.spring.hibernate.app.util.HibernateUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    public void addPerson(PersonRequest personRequest) {

        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        Person person = new Person();
        person.setFirstName(personRequest.getFirstName());
        person.setLastName(personRequest.getLastName());
        person.setEmail(personRequest.getEmail());
        person.setPassword(personRequest.getPassword());
        person.setPhoneNo(personRequest.getPhoneNo());
        session.persist(person);
        System.out.println("Person added successfully " + person.getPersonId());
        session.getTransaction().commit();
        session.close();
    }
}
