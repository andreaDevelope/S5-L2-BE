package it.epicode.S5_L2_BE.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Topping {

    @Id
    private Long id;

    private String name;
    private double price;

    @ManyToMany(mappedBy = "toppings")
    private List<PizzaBase> pizzas = new ArrayList<>();

    public Topping(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Topping() {
    }
}
