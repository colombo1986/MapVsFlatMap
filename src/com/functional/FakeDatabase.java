package com.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class FakeDatabase {

    public static List<Customer> getAll() {
        return Stream.of(
                new Customer(101, "juan", "juan@gmail.com", Arrays.asList("111111", "222222")),
                new Customer(102, "maria", "maria@gmail.com", Arrays.asList("33333", "444444")),
                new Customer(103, "pedro", "pedro@gmail.com", Arrays.asList("44444", "55555")),
                new Customer(104, "alicia", "alicia@gmail.com", Arrays.asList("666666", "777777"))
         ).collect(Collectors.toList());
       }
    }

