package com.spring.hibernate.app;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateAppApplication {

	public static void main(String[] args) {

		/*Session session = HibernateUtils.getSessionFactory().openSession();
		session.beginTransaction();
		session.close();*/
		SpringApplication.run(HibernateAppApplication.class, args);
	}

}
