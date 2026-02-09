package br.com.fiap.CoffeeTech.model;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "orderss")
public class Order {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "{order.date.notnull}")
    private LocalDateTime date;

    @NotNull(message = "{order.coffee.notnull}")
    @ManyToOne
    private Coffee coffee;

    @NotNull(message = "{order.customer.notnull}")
    @ManyToOne
    private Customer customer;
}
