package com.spring.hibernate.app.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Key {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int keyId;
    private String key;
    private String value;
    private boolean encrypt;
    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    private Person person;

}
