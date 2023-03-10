package com.example.metrics.repository;

import com.example.metrics.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class CustomerRepository {
    private static final List<Customer> CUSTOMER = new ArrayList<>();

    public List<Customer> findAll() {
        return CUSTOMER;
    }

    public void save(Customer customer) {
        CUSTOMER.add(customer);
    }

    public void delete(UUID uuid) {
        CUSTOMER.stream()
                .filter(customer -> customer.id().equals(uuid))
                .findFirst()
                .ifPresent(CUSTOMER::remove);
    }
}
