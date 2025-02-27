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

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getAddressById(@PathVariable long id){
        return new ResponseEntity<>("Address with ID " + id + " fetched successfully.", HttpStatus.OK);
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<String> putAddressAtId(@PathVariable long id){
        return new ResponseEntity<>("Address updated successfully at ID " + id, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddressById(@PathVariable long id){
        return new ResponseEntity<>("Address deleted successfully at ID " + id, HttpStatus.OK);
    }
}
