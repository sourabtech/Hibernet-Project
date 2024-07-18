package com.hibernate;  
import java.util.*;  
import javax.persistence.*;  
import org.hibernate.*;  
import org.hibernate.boot.Metadata;  
import org.hibernate.boot.MetadataSources;  
import org.hibernate.boot.registry.StandardServiceRegistry;  
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;  
    
public class App {    
public static void main(String[] args) {    
    
     StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();  
        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();  
          
        SessionFactory factory=meta.getSessionFactoryBuilder().build();  
        Session session=factory.openSession();  
        Transaction tx = session.beginTransaction();
        
        Employe12 emp= new Employe12();
    emp.setId(5);
      emp.setName("sam");
      emp.setSalary(77800);
      emp.setJob("Devloper");
      session.save(emp);
      System.out.println("added data");

        
   /* //Hibernate Named Query    
           TypedQuery query = session.getNamedQuery("findEmployeeByName");    
            query.setParameter("name","sagar");   
                    
            List<Employe12> employees=query.getResultList();   
            
    Iterator<Employe12> itr=employees.iterator();    
     while(itr.hasNext()){    
    	 Employe12 e=itr.next();    
    System.out.println(e);    
     }    */
      tx.commit(); // Commit the transaction

    session.close();     
  }    
}    