package org.jsp.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsertRecord {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		etran.begin();
		Merchant m=new Merchant();
		m.setName("Gucci");
		m.setGst_num("gucci7905");
		m.setEmail("gucci@gmail.com");
		m.setPhone(894447548l);
		m.setPassword("gucci@123");
		
		em.persist(m);
		etran.commit();
		
	}
}
