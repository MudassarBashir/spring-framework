package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
		
		Person person = (Person)context.getBean("person");
		person.setTaxId(666);
		System.out.println(person);

		Address address2 = (Address)context.getBean("address2");
		System.out.println(address2);

        /**
         * Some IDEs, Eclipse in particular, generate an annoying warning when the application context isn't closed.
         * Here is what it looks like when we do close it. Notice that the close() method belongs to
         * FileSystemXmlApplicationContext and not ApplicationContext, hence the casting is needed.
         */
		((ClassPathXmlApplicationContext) context).close();
	}

}
