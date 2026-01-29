package br.com.fiap.CoffeeTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.CoffeeTech.model.Customer;
import br.com.fiap.CoffeeTech.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CustomerService {
    
    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {
        return customerRepository
                            .findById(id)
                            .orElseThrow(
                                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No customer found with the id: " + id)
                            );
    }

    public Customer create(Customer customer) {
        log.info("Registering customer: " + customer);
        return customerRepository.save(customer);
    }

    public Customer update(Long id, Customer customer) {
        log.info("Updating customer with the id: " + id);
        getCustomerById(id);
        customer.setId(id);
        return customerRepository.save(customer);
    }

    public void delete(Long id) {
        log.info("Deleting customer with the id: " + id);
        Customer customer = getCustomerById(id);
        customerRepository.delete(customer);
    }
}
