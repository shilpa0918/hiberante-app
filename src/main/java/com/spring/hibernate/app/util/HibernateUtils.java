package com.spring.hibernate.app.util;

import com.spring.hibernate.app.entity.Key;
import com.spring.hibernate.app.entity.Person;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Person.class);
            configuration.addAnnotatedClass(Key.class);
            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
        } catch (Exception e) {
            throw new RuntimeException("Error building the session factory");
        }
    }
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
