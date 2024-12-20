package it.epicode.S5_L2_BE.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class PizzaBase {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private double price;
    private String nutritionFacts;
    private Long kcal;

    @OneToMany
    private List<Topping> toppings = new ArrayList<>();

    @ManyToOne
    private Menu menu;

    public void addTopping(Topping t){
        toppings.add(t);
    }
}
