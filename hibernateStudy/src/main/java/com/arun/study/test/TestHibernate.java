package com.arun.study.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arun.study.model.Message;

public class TestHibernate {

	public static void main(String[] args) {
		Message message = new Message(1,"Hello arun", "arun.mathew");

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(message);
		session.getTransaction().commit();
	}

}
