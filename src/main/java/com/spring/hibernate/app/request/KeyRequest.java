package com.spring.hibernate.app.request;

import com.spring.hibernate.app.entity.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class KeyRequest {
    private String key;
    private String value;
    private boolean encrypt;
    private int person;



}
