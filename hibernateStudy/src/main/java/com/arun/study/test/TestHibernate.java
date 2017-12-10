package com.arun.study.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.arun.study.model.AnnotationTest;
import com.arun.study.model.Message;

public class TestHibernate {

	public static void main(String[] args) {
		Message message = new Message(1,"Hello arun", "arun.mathew");
		String description = "This is to test annotations like @Id, @Temporal, @Transient";
		AnnotationTest aTest = new AnnotationTest("Annotation Test",description, 1);

		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(message);
		session.save(aTest);
		session.getTransaction().commit();
	}

}
