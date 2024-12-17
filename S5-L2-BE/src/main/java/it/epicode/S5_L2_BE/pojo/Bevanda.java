package it.epicode.S5_L2_BE.pojo;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Bevanda {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String name;
    private double price;
    private Long kcal;
    private String nutritionFacts;

    @ManyToOne
    private Menu menu;
}
