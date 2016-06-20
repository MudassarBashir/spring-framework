package com.caveofprogramming.spring.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext context = new FileSystemXmlApplicationContext("C:\\Users\\mbashir\\Documents\\Courses\\Spring-Framework_John-Purcell_CaveOfProgramming\\spring-framework\\src\\main\\java\\com\\caveofprogramming\\spring\\test\\com\\caveofprogramming\\spring\\test\\beans\\beans.xml");
		
		Person person = (Person)context.getBean("person");
		person.speak();

        /**
         * Some IDEs, Eclipse in particular, generate an annoying warning when the application context isn't closed.
         * Here is what it looks like when we do close it. Notice that the close() method belongs to
         * FileSystemXmlApplicationContext and not ApplicationContext, hence the casting is needed.
         */
		((FileSystemXmlApplicationContext) context).close();
	}

}
