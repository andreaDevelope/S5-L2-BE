package it.epicode.S5_L2_BE.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class PizzaBase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private double price;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Topping> toppings = new ArrayList<>();

    public PizzaBase(String name, double price, List<Topping> toppings) {
        this.name = name;
        this.price = price;
        this.toppings = toppings;
    }

    public PizzaBase() {
    }

    public void addTopping(Topping t){
        toppings.add(t);
    }
}
