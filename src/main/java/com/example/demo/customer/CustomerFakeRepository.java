package com.example.demo.customer;

import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return List.of(
                new Customer(1L, "Dave Jones", "password123", "email@gmail.com"),
                new Customer(2L, "James Bond", "123password", "email@gmail.com")
                );
    }
}
