package br.com.fiap.CoffeeTech.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import br.com.fiap.CoffeeTech.model.Order;
import br.com.fiap.CoffeeTech.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderService {
    
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAllOrders() {
        return orderRepository.findAll();
    }

    public Order getOrderById(Long id) {
        return orderRepository
                            .findById(id)
                            .orElseThrow(
                                () -> new ResponseStatusException(HttpStatus.NOT_FOUND, "No order found with the id: " + id)
                            );
    }

    public Order create(Order order) {
        log.info("Registering order: " + order);
        return orderRepository.save(order);
    }

    public Order update(Long id, Order orderUpdated) {
        log.info("Updating order with the id: " + id);
        Order order = getOrderById(id);
        order.setDate(orderUpdated.getDate());
        order.setCoffee(orderUpdated.getCoffee());
        order.setCustomer(orderUpdated.getCustomer());
        return orderRepository.save(order);
    }

    public void delete(Long id) {
        log.info("Deleting order with the id: " + id);
        Order order = getOrderById(id);
        orderRepository.delete(order);
    }
}
