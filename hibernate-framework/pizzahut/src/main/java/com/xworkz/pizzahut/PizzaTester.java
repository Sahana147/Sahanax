package com.xworkz.pizzahut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.xworkz.pizzahut.dto.PizzaHutDTO;

public class PizzaTester {

	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session session = sessionFactory.openSession();
		PizzaHutDTO pizzaHutDTO = new PizzaHutDTO("capsicum","mysore",199,true, "regular", "veg");
		Transaction transaction = session.beginTransaction();
		session.save(pizzaHutDTO);
		transaction.commit();
		
	}

}
