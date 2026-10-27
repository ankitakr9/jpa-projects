package org.jsp.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateRecordByMerge {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		EntityTransaction etran=em.getTransaction();
		
		etran.begin();
		Merchant m= new Merchant();
		m.setId(5);
		m.setName("Gucciii");
		m.setEmail("gucci_1223434");
		m.setPhone(837464789l);
		m.setPassword("Gucci@1234");		
		em.merge(m);
		etran.commit();
		
	}
}
