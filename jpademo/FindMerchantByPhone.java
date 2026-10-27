package org.jsp.jpademo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByPhone {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("M15");
		EntityManager em=emf.createEntityManager();
		Query q=em.createNativeQuery("select * from merchant_info where phone=?1",Merchant.class);
		
		System.out.println("Enter the Phone: ");
		q.setParameter(1, new Scanner(System.in).nextLong());
		
		try {
			Merchant m=(Merchant) q.getSingleResult();
			System.out.println(m);
		}catch(NoResultException e) {
			System.err.println("No record found");
		}
	}
}
