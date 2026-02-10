package br.com.fiap.CoffeeTech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.fiap.CoffeeTech.model.Coffee;
import br.com.fiap.CoffeeTech.service.CoffeeService;
import jakarta.validation.Valid;

@RestController
@RequestMapping("coffes")
public class CoffeeController {
    
    @Autowired
    private CoffeeService coffeeService;

    @GetMapping
    public List<Coffee> findAllCoffees() {
        return coffeeService.findAllCoffees();
    }

    @GetMapping("{id}")
    public Coffee getCoffeeById(@PathVariable Long id) {
        return coffeeService.getCoffeeById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Coffee create(@RequestBody @Valid Coffee coffee) {
        return coffeeService.create(coffee);
    }

    @PutMapping("{id}")
    public Coffee update(@PathVariable Long id, @RequestBody @Valid Coffee coffeeUpdated) {
        return coffeeService.update(id, coffeeUpdated);
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        coffeeService.delete(id);
    }
}
