package com.functional;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Customer> customerList= FakeDatabase.getAll();
        //List<Customer> convert List<String> -> Data transformation
        //mapping : customer -> customer.getEmail()
        //one to one mapping -> one customer , one email id

       List<String> emails =  customerList.stream().map(customer -> customer.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        //customer -> one to many mapping -> one customer , n phone numbers
        List<List<String>> phoneNumbers =  customerList.stream().map(customer -> customer.getPhoneNumbers()).collect(Collectors.toList());
        System.out.println(phoneNumbers);

        //List<Customer> convert List<String> -> Data transformation
        //mapping : customer -> phone Numbers
        List<String> phones = customerList.stream().flatMap(customer -> customer.getPhoneNumbers().stream()).collect(Collectors.toList());
        System.out.println(phones);

    }
}
