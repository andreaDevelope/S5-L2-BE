package it.epicode.S5_L2_BE.pojo;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

import java.util.List;

@Data
@Entity
@DiscriminatorValue("Margherita")
public class Margherita extends PizzaBase {

    public Margherita() {
        super("Margherita", 5.0, List.of(
                new Topping("Pomodoro", 1.5),
                new Topping("Mozzarella", 1.5)
        ));
    }
}
