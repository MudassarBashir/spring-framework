package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context =
                new ClassPathXmlApplicationContext("beans.xml");
		
		Person person1 = (Person)context.getBean("person");
		Person person2 = (Person)context.getBean("person");

		System.out.println(person1);
		System.out.println(person2);

		person1.setTaxId(666);

		System.out.println(person1);
		System.out.println(person2);

        /**
         * Some IDEs, Eclipse in particular, generate an annoying warning when the application context isn't closed.
         * Here is what it looks like when we do close it. Notice that the close() method belongs to
         * FileSystemXmlApplicationContext and not ApplicationContext, hence the casting is needed.
         */
		((ClassPathXmlApplicationContext) context).close();
	}

}
