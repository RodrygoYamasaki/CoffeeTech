package br.com.fiap.CoffeeTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.CoffeeTech.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
    
}
