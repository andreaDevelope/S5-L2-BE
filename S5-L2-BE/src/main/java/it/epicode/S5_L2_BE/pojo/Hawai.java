package it.epicode.S5_L2_BE.pojo;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Data
@Entity
@DiscriminatorValue("Hawai")
public class Hawai extends PizzaBase {

    public Hawai() {
        super("Hawaiian", 7.0, List.of(
                new Topping("Pomodoro", 1.5),
                new Topping("Mozzarella", 1.5),
                new Topping("Prosciutto", 5.0),
                new Topping("Ananas", 5.0)
        ));
    }
}

