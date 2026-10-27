package org.jsp.jpademo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class fetchAllPhoneNumbers {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Query q=em.createNativeQuery("select phone from merchant_info");
		
		List<Integer> pl=q.getResultList();
		if(!pl.isEmpty()) {
			Iterator<Integer> i=pl.iterator();
			while(i.hasNext()) {
				Object l=i.next();
				System.out.println(l);
			}
		}else {
			System.err.println("No record found");
		}
		
	}
}
