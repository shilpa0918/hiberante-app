package com.spring.hibernate.app.util;

import com.spring.hibernate.app.entity.Key;
import com.spring.hibernate.app.entity.Person;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import java.util.Properties;

public class HibernateUtil {
    private static HibernateUtil sessionFactoryUtil=null;
    private HibernateUtil(){

    }
    public static HibernateUtil getSessionFactory() {
        if (sessionFactoryUtil == null) {
            Properties properties = new Properties();
            properties.setProperty("hibernate.connection.driver", "org.postgresql.Driver");
            properties.setProperty("hibernate.connection.url", "jdbc:postgresql://localhost:5432/postgres");
            properties.setProperty("hibernate.connection.username", "postgres");
            properties.setProperty("hibernate.connection.password", "root");

            properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQL10Dialect");
            properties.setProperty("hibernate.connection.password", "root");
            properties.setProperty("hibernate.hbm2ddl.auto", "update");

            //show sql queries
            properties.setProperty("hibernate.show_sql", "true");

            Configuration configuration = new Configuration();
            configuration.addAnnotatedClass(Person.class);
            configuration.addAnnotatedClass(Key.class);

            ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(properties).build();
            sessionFactoryUtil = (HibernateUtil) configuration.buildSessionFactory(serviceRegistry);
        }
        return sessionFactoryUtil;
    }

}
