package com.spring.address_book_app.controller;

import com.spring.address_book_app.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/address-book")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @PostMapping("/post")
    public ResponseEntity<String> addAddressBook(){
        return addressBookService.addAddressBook();
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<String> getAddressBookById(@PathVariable long id){
        return addressBookService.getAddressBookById(id);
    }

    @GetMapping("/get/all")
    public ResponseEntity<String> getAllAddressBook(){
        return addressBookService.getAllAddressBook();
    }

    @PutMapping("/put/{id}")
    public ResponseEntity<String> putAddressBookAtId(@PathVariable long id){
        return addressBookService.updateAddressBookAtId(id);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteAddressById(@PathVariable long id){
        return addressBookService.deleteAddressBookById(id);
    }

    @DeleteMapping("/delete/all")
    public ResponseEntity<String> deleteAddressBooks(){
        return addressBookService.deleteAllAddressBooks();
    }
}
