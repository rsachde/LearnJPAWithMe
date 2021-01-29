package com.ria.hibernate.devloper.databasedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Person {
    private Integer ID;
    String name;
    String location;
    String Birth_Date;
}
