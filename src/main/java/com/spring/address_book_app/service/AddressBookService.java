package com.spring.address_book_app.service;

import com.spring.address_book_app.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService {

    private final List<AddressBookDTO> addressBookDTOList = new ArrayList<>();

    public ResponseEntity<AddressBookDTO> addAddressBook(AddressBookDTO addressBookDTO){
        addressBookDTOList.add(addressBookDTO);
        return new ResponseEntity<>(addressBookDTO, HttpStatus.CREATED);
    }

    public ResponseEntity<List<AddressBookDTO>> getAllAddressBooks(){
        return new ResponseEntity<>(addressBookDTOList, HttpStatus.OK);
    }

    public ResponseEntity<AddressBookDTO> getAddressBookByName(String name){
        for(AddressBookDTO addressBookDTO: addressBookDTOList){
            if(addressBookDTO.getName().equalsIgnoreCase(name)){
                return new ResponseEntity<>(addressBookDTO, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<AddressBookDTO> updateAddressBookByName(String name, AddressBookDTO newAddressBookDTO){
        for(int i = 0; i < addressBookDTOList.size(); i++){
            if(addressBookDTOList.get(i).getName().equalsIgnoreCase(name)){
                addressBookDTOList.set(i, newAddressBookDTO);
                return new ResponseEntity<>(newAddressBookDTO, HttpStatus.OK);
            }
        }
        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }

    public ResponseEntity<String> deleteAddressBookByName(String name){
        for(AddressBookDTO addressBookDTO : addressBookDTOList){
            if(addressBookDTO.getName().equalsIgnoreCase(name)){
                addressBookDTOList.remove(addressBookDTO);
                return new ResponseEntity<>("Deleted book with name " + name + " successfully", HttpStatus.OK);
            }
        }
        return new ResponseEntity<>("No address book found with name " + name, HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<String> deleteAllAddressBooks(){
        return (addressBookDTOList.removeAll(addressBookDTOList) ? new ResponseEntity<>("All address books deleted successfully", HttpStatus.OK) : new ResponseEntity<>("No address book found to delete", HttpStatus.NO_CONTENT));
    }

}