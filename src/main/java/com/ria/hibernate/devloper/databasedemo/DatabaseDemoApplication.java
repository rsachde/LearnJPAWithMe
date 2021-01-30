package com.ria.hibernate.devloper.databasedemo;

import com.ria.hibernate.devloper.databasedemo.JDBC.PersonJDBCDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DatabaseDemoApplication implements CommandLineRunner {

    @Autowired
    PersonJDBCDAO personJDBCDAO;

    public static void main(String[] args) {
        SpringApplication.run(DatabaseDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(personJDBCDAO.findAll());
        System.out.println(personJDBCDAO.findByID(1002));
        System.out.println(personJDBCDAO.deletByID(1001));
        System.out.println("I am in feature02");
    }
}
