package com.spring.address_book_app.service;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class AddressBookService {

    public ResponseEntity<String> addAddressBook(){
        return new ResponseEntity<String>("Address book added succefully", HttpStatus.OK);
    }

    public ResponseEntity<String> getAllAddressBook(){
        return new ResponseEntity<>("All Address Books fetched successfully", HttpStatus.OK);
    }

    public ResponseEntity<String> getAddressBookById(Long id){
        return new ResponseEntity<>("Address book with ID " + id + " fetched successfully", HttpStatus.OK);
    }

    public ResponseEntity<String> updateAddressBookAtId(Long id){
        return new ResponseEntity<>("Address book updated successfully at ID " + id, HttpStatus.OK);
    }

    public ResponseEntity<String> deleteAddressBookById(Long id){
        return new ResponseEntity<>("Address book deleted successfully at ID " + id, HttpStatus.OK);
    }

    public ResponseEntity<String> deleteAllAddressBooks(){
        return new ResponseEntity<>("All Address books deleted successfully", HttpStatus.OK);
    }
}
