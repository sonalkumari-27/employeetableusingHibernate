package com.hibernate.Hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       EntityManagerFactory emf= Persistence.createEntityManagerFactory("myPU");
       EntityManager em=emf.createEntityManager();
       EntityTransaction et=em.getTransaction();
       et.begin();
       employee e = new employee("almn",9000);
       em.persist(e);
       et.commit();
       em.close();
       emf.close();
    }
}