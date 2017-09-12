# spring-framework-understanding
Code along of a Spring framework course.

Below are important points of learning from the video series. The digit before the decimal point indicates the chapter or module number. The digits after the decimal point indicate the video number.
Until tutorial or video #5, the previous videos simply explain what the Spring framework is and does. Maven is also explained as a tool that greatly
enhances productivity when working with Java and Spring together.

01.05
Using the Spring framework within a Java application consists of getting the correct dependencies (JAR files) on the classpath and then creating
XML files which instruct the Spring framework on how to wire your business objects together. After these configuration steps are complete, usually
an instance of Spring's ApplicationContext is created and passed the XML file which contains the bean definitions. This is how Spring will know what
beans a particular application has or wants to work with and how they are dependent on or wired with each other. When you need an instance of a 
particular bean you don't use the 'new' operator to instantiate is yourself, you ask the Spring ApplicationContext instance for it.

01.06 
ClassPathXMLApplicationContext
Using ClassPathXMLApplicationContext. Note, this did not work for me as it does by default in Eclipse. 
I had to change a line in an IDEA configuration file according to the second answer on this page:
http://stackoverflow.com/questions/31076576/xml-files-are-not-copied-to-target-intellij-idea

I put in a no arg constructor for Person just to see what effect it has.
It does log it's message which means it gets called from Spring.

02.13 P namespaces
The p name space allows us to use a more succinct syntax to declare 
bean property settings. The corresponding properties must have setters
declared in Java.

02.16 An inner bean is appropriate when it will only be needed by it's
parent bean since it cannot be referenced outside that scope.

07/05/17 If Intellij IDEA complains that it can't find XML resources on the classpath,
delete the isMavenModule clause from offers-web-application.iml and restart the IDE and
rerun the project.

07.23.2017 Application depends on a local MySQL data source which I have configure and must run in order
for the web application to be able to interact with it's data. Application is deployed as a WAR file locally
in Tomcat 7. I've defined the data source as a JNDI resource in Tomcat's conf subdirectory.

09.11.2017 After a resources clause was added to the master POM file to allow for packagind of the XML
bean definition files into the WAR file, and a context.xml file
was added to get Maven's Tomcat 7 plugin to register a jndi data source, I also had to make
a Maven run configuration in Intellij IDEA to run this application in an embedded Tomcat 7 server using
Maven's Tomcat plugin.


