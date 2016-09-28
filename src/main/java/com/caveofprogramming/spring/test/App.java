package com.caveofprogramming.spring.test;

import com.caveofprogramming.spring.dao.OffersDAO;
import com.caveofprogramming.spring.model.Offer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import java.util.List;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");

        Offer offer3 = new Offer(8, "Sam", "sam@nowhere.com", "Let me code man!");

        if (offersDao.update(offer3) == true) {
            System.out.println("Updated offer object.");
        }
        else {
            System.out.println("Cannot update object.");
        }

        try {
            Offer offer1 = new Offer("Moe", "moe@nowhere.com", "Java coding");
            Offer offer2 = new Offer("John", "john@caveofprogramming.com", "Java super coding");
            if (offersDao.create(offer1)) {
                System.out.println("Created offer object.");
            }
            if (offersDao.create(offer2)) {
                System.out.println("Created offer object.");
            }

            offersDao.delete(1);
            List<Offer> offers = offersDao.getOffers();

            for (Offer offer : offers) {
                System.out.println(offer);
            }

            Offer offer = offersDao.getOffer(2);
            System.out.println("Should be Mike: " + offer);
        } catch (CannotGetJdbcConnectionException e) {
            System.out.println("Could not connect to datasource.");
        } catch (DataAccessException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }

        ((ClassPathXmlApplicationContext)context).close();
	}

}
