package com.spring.hibernate.app.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class PersonRequest {
    private String firstName;
    private String email;
    private String lastName;
    private String password;
    private String phoneNo;
}
