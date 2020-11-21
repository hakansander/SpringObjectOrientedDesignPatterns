package com.hakansander.springbuilderdesignpattern.controller;

import com.hakansander.springbuilderdesignpattern.builder.Contact;
import com.hakansander.springbuilderdesignpattern.builder.ContactBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class BuilderController {

    @GetMapping("contacts")
    public List<Contact> getContacts() {
        List<Contact> contacts = new ArrayList<>();

        Contact contact = new Contact();
        contact.setFirstName("George");
        contact.setLastName("Washington");
        contacts.add(contact);

        contacts.add(new Contact("John", "Adams", null));

        contacts.add(new ContactBuilder().setFirstName("Thomas").setLastName("Jefferson").buildContact());

        return contacts;
    }

}
