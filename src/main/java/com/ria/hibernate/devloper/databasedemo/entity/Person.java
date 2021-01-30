package com.ria.hibernate.devloper.databasedemo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Component
@Builder
public class Person {
    private Integer ID;
    String name;
    String location;

}
