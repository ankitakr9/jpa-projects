package org.jsp.jpademo;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindAllgstnum {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Query q=em.createNativeQuery("select gst_num from merchant_info");
		
		List<String> gst=q.getResultList();
		if(!gst.isEmpty()) {
			Iterator<String> i=gst.iterator();
			while(i.hasNext()) {
				Object l=i.next();
				System.out.println(l);
			}
		}else {
			System.err.println("No record found");
		}
		
	}
}
