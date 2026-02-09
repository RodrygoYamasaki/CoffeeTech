package br.com.fiap.CoffeeTech.model;

import java.math.BigDecimal;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
public class Coffee {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{coffee.name.notblank}")
    private String name;

    @NotBlank(message = "{coffee.description.notblank}")
    private String description;

    @PositiveOrZero(message = "{coffee.price.positiveorzero}")
    private BigDecimal price;

    @NotNull(message = "{coffee.size.notnull}")
    @Enumerated(EnumType.STRING)
    private CoffeeSizeType size;
}
