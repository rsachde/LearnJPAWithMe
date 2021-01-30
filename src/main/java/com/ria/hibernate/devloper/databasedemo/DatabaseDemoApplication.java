package com.ria.hibernate.devloper.databasedemo;

import com.ria.hibernate.devloper.databasedemo.JDBC.PersonJDBCDAO;
import com.ria.hibernate.devloper.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

    @Autowired
    PersonJDBCDAO personJDBCDAO;

    @Autowired
    Person person;



    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        //System.out.println(personJDBCDAO.findByID(1002));
        //System.out.println(personJDBCDAO.deletByID(1001));
        person.setName("Manju");
        person.setID(1004);
        person.setLocation("Bhiwani");
        System.out.println(personJDBCDAO.insert(person));
        System.out.println(personJDBCDAO.findAll());
        System.out.println("I am in feature01");


    }
}
