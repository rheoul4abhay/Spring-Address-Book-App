package com.spring.address_book_app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address-book")
public class AddressBookController {

    @PostMapping("/post")
    public ResponseEntity<String> addAddress(){
        return new ResponseEntity<>("Address posted successfully", HttpStatus.OK);
    }

    @GetMapping("/get")
    public ResponseEntity<String> getAddress(){
        return new ResponseEntity<>("Address fetched successfully", HttpStatus.OK);
    }

    @PutMapping("/put")
    public ResponseEntity<String> putAddress(){
        return new ResponseEntity<>("Address updated successfully", HttpStatus.OK);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteAddress(){
        return new ResponseEntity<>("Address deleted successfully", HttpStatus.OK);
    }
}
