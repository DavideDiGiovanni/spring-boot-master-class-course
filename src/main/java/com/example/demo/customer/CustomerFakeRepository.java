package com.example.demo.customer;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository(value = "fake")
public class CustomerFakeRepository implements CustomerRepo {

    @Override
    public List<Customer> getCustomers() {
        return List.of(
                new Customer(1L, "Dave Jones"),
                new Customer(2L, "James Bond")
                );
    }
}
