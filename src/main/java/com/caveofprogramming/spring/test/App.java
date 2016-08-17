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

        try {
            List<Offer> offers = offersDao.getOffers();

            for (Offer offer : offers) {
                System.out.println(offer);
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
