package br.com.fiap.CoffeeTech.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.CoffeeTech.model.Coffee;

public interface CoffeeRepository extends JpaRepository<Coffee, Long>{
    
}
