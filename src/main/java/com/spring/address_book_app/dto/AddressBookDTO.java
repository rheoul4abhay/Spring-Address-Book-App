package com.spring.address_book_app.dto;

public class AddressBookDTO {

    private String name;
    private Long phoneNumber;
    private String bookPassword;

    public AddressBookDTO(){};

    public AddressBookDTO(String name, Long phoneNumber, String bookPassword){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.bookPassword = bookPassword;
    }

    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
