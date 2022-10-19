package com.spring.hibernate.app.controller;

import com.spring.hibernate.app.request.KeyRequest;
import com.spring.hibernate.app.service.KeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class KeyController {

    @Autowired
    KeyService keyService;
    @PostMapping("/addKey")
    public ResponseEntity addKey(@RequestBody KeyRequest keyRequest){
        keyService.addKey(keyRequest);
        return new ResponseEntity(HttpStatus.CREATED);
    }
}
