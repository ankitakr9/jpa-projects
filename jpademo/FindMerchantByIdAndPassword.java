package org.jsp.jpademo;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FindMerchantByIdAndPassword {

    public static void main(String[] args) {

        EntityManagerFactory emf =
                Persistence.createEntityManagerFactory("M15");

        EntityManager em = emf.createEntityManager();

        Query q = em.createNamedQuery("findMerchantByIdAndPassword");

        System.out.println("Enter the ID: ");
        q.setParameter(1, new Scanner(System.in).nextInt());

        System.out.println("Enter the Password: ");
        q.setParameter(2, new Scanner(System.in).next());

        try {

            Merchant m = (Merchant) q.getSingleResult();

            System.out.println("Verification Successful");
            System.out.println(m);

        } catch (NoResultException e) {

            System.err.println("Invalid ID or Password");
        }
    }
}