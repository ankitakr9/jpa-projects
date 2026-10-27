package org.jsp.jpademo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllEmail {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Query q=em.createNativeQuery("select email from merchant_info");
		
		List<String> ei=q.getResultList();
		if(!ei.isEmpty()) {
			Iterator<String> i=ei.iterator();
			while(i.hasNext()) {
				Object l=i.next();
				System.out.println(l);
			}
		}else {
			System.err.println("No record found");
		}
		
	}
}
