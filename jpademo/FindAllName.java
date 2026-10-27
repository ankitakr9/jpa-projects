package org.jsp.jpademo;

import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import java.util.List;

public class FindAllName {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Query q=em.createNativeQuery("select sname from merchant_info");
		
		List<String> nm=q.getResultList();
		if(!nm.isEmpty()) {
			Iterator<String> i=nm.iterator();
			while(i.hasNext()) {
				Object l=i.next();
				System.out.println(l);
			}
		}else {
			System.err.println("No record found");
		}
		
	}
}
