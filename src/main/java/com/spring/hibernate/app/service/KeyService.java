package com.spring.hibernate.app.service;

import com.spring.hibernate.app.entity.Key;
import com.spring.hibernate.app.entity.Person;
import com.spring.hibernate.app.request.KeyRequest;
import com.spring.hibernate.app.util.HibernateUtils;
import org.hibernate.Session;
import org.springframework.stereotype.Service;

@Service
public class KeyService {

    public void addKey(KeyRequest keyRequest){
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        Key key = new Key();
        key.setKey(keyRequest.getKey());
        key.setEncrypt(keyRequest.isEncrypt());
        key.setValue(keyRequest.getValue());
        Person person = session.get(Person.class,keyRequest.getPerson());
        key.setPerson(person);
        session.persist(key);
        System.out.println("Key added successfully " + key.getKeyId());
        session.getTransaction().commit();
        session.close();
    }

}
