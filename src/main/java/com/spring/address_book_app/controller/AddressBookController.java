package com.spring.address_book_app.controller;

import com.spring.address_book_app.dto.AddressBookDTO;
import com.spring.address_book_app.service.AddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/address-book")
public class AddressBookController {

    @Autowired
    private AddressBookService addressBookService;

    @PostMapping("/add")
    public ResponseEntity<AddressBookDTO> addAddressBook(@RequestBody AddressBookDTO addressBookDTO){
        return addressBookService.addAddressBook(addressBookDTO);
    }

    @GetMapping("/get/{name}")
    public ResponseEntity<AddressBookDTO> getAddressBookByName(@PathVariable String name){
        return addressBookService.getAddressBookByName(name);
    }

    @GetMapping("/get/all")
    public ResponseEntity<List<AddressBookDTO>> getAllAddressBook(){
        return addressBookService.getAllAddressBooks();
    }

    @PutMapping("/update/{name}")
    public ResponseEntity<AddressBookDTO> putAddressBookAtId(@PathVariable String name, @RequestBody AddressBookDTO addressBookDTO){
        return addressBookService.updateAddressBookByName(name, addressBookDTO);
    }

    @DeleteMapping("/delete/{name}")
    public ResponseEntity<String> deleteAddressById(@PathVariable String name){
        return addressBookService.deleteAddressBookByName(name);
    }

    @DeleteMapping("/delete/all")
    public ResponseEntity<String> deleteAddressBooks(){
        return addressBookService.deleteAllAddressBooks();
    }
}