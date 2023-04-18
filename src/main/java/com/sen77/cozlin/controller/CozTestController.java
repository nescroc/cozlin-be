package com.sen77.cozlin.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api")
public class CozTestController {

    @RequestMapping(value = "/{testStr}",method = RequestMethod.GET)
    public ResponseEntity<?> hiCozlin(@PathVariable String testStr){
        return new ResponseEntity<>("hi Cozlin => "+testStr,null, HttpStatus.OK);
    }
}
