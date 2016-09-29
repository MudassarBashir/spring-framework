package com.caveofprogramming.spring.test;

import com.caveofprogramming.spring.dao.OffersDAO;
import com.caveofprogramming.spring.model.Offer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.CannotGetJdbcConnectionException;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		OffersDAO offersDao = (OffersDAO) context.getBean("offersDao");

        try {
            List<Offer> offersList = new ArrayList<Offer>();
            offersList.add(new Offer(1, "Larry", "larry@stooges.com", "What's the big idea?"));
            offersList.add(new Offer(2, "Curly", "curly@stooges.com", "Soitenly!"));

            int[] rvals = offersDao.create(offersList);

            for (int value : rvals) {
                System.out.println("Updated " + value + " rows.");
            }

        } catch (CannotGetJdbcConnectionException e) {
            System.out.println("Could not connect to datasource.");
        } catch (DataAccessException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getClass());
        }

        ((ClassPathXmlApplicationContext)context).close();
	}

}
