package br.com.fiap.CoffeeTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.CoffeeTech.model.Coffee;
import br.com.fiap.CoffeeTech.repository.CoffeeRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class CoffeeService {
    
    @Autowired
    private CoffeeRepository coffeeRepository;

    public List<Coffee> findAllCoffees() {
        return coffeeRepository.findAll();
    }

    public Coffee getCoffeeById(Long id) {
        return coffeeRepository
                            .findById(id)
                            .orElseThrow(
                                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No coffee found with the id: " + id)
                            );
    }

    public Coffee create(Coffee coffee) {
        log.info("Registering coffee: " + coffee);
        return coffeeRepository.save(coffee);
    }

    public Coffee update(Long id, Coffee coffee) {
        log.info("Updating coffee with the id: " + id);
        getCoffeeById(id);
        coffee.setId(id);
        return coffeeRepository.save(coffee);
    }

    public void delete(Long id) {
        log.info("Deleting coffee with the id: " + id);
        Coffee coffee = getCoffeeById(id);
        coffeeRepository.delete(coffee);
    }
}
