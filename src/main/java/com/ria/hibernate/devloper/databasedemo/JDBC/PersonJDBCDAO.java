package com.ria.hibernate.devloper.databasedemo.JDBC;

import com.ria.hibernate.devloper.databasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJDBCDAO {

    @Autowired
    JdbcTemplate jdbcTemplate;



    public List<Person> findAll()
    {
        //From the result set I need to map it to bean persons
        // We need to use automatic object mapper that maps the result set to the Person Bean
        //return jdbcTemplate.query("select * from persons", new BeanPropertyRowMapper<>(Person.class));

        return jdbcTemplate.query("select * from persons", new BeanPropertyRowMapper<>(Person.class));


    }

    public Person findByID(int id)
    {
        return jdbcTemplate.queryForObject("select * from persons where id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Person.class));
    }

    public int deletByID(int id)
    {
        return jdbcTemplate.update("Delete  from persons where id=?", new Object[]{id});
    }
    public int insert(Person person)
    {
        return jdbcTemplate.update("insert into person(id, name, LOCATION, BIRTH_DATE)" + "values(?,?,?,?)" + new Object[]{person.getID(), person.getName(), person.getLocation(), person.getBirth_Date()});
    }
}
