package com.example.demo.customer;

import java.util.List;

public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return List.of(
                new Customer(1L, "Dave Jones"),
                new Customer(2L, "James Bond")
                );
    }
}
