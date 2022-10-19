package com.spring.hibernate.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int personId;
    private String firstName;
    private String email;
    private String lastName;
    private String password;
    private String phoneNo;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "person")
    private List<Key> keys;
}
