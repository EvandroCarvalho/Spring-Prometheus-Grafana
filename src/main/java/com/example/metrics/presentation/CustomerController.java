package com.example.metrics.presentation;

import com.example.metrics.model.Customer;
import com.example.metrics.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping(path = "v1.0/customers", produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerRepository customerRepository;

    @GetMapping
    public List<Customer> getSomething() {
        return customerRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(value = HttpStatus.CREATED)
    public void getSomething(@RequestBody Customer customer) {
        customerRepository.save(customer);
    }

    @DeleteMapping(path = "/{customerId}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void getSomething(@PathVariable(value = "customerId") UUID customerId) {
        customerRepository.delete(customerId);
    }

}
