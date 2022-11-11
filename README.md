# SpringSecurity


This is just basic spring secuirty project example

SpringSecurity is  a framework that implies restrictions to our spring web based application.
spring security mainly works in two major areas of application :
1)Authentication
2)Authorization


In order to implement spring security in springboot we need to add security starter dependency in pom.xml file
<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-security</artifactId>
		</dependency>
    
    whenu add  above depedency and juz  print  hello world in controller class it gives 
    401 unauthorized error
    it means spring security imposing security to our http request in this case
    we need to add user and pwd to or request 
    in post man under authorize section by default username is user and password will be 
    when u start the application after adding dependency in console logs 
    password will be generated and printed in logs that pwd need to be added
    
    
    we can customize the default username and password in 2 ways 
    1)via properties file we can add below properties 
    
    
    spring.security.user.name=system
    spring.security.user.password=women
    
    2)we can extend WebSecurityConfigurerAdapter class which is abstract class in securityconfig class and need to override configure and we can add
    our own username and pwd
