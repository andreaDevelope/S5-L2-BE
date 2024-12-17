package it.epicode.S5_L2_BE.pojo;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany
    private List<PizzaBase> pizze=new ArrayList<>();

    @OneToMany
    private List<Bevanda> bevande=new ArrayList<>();

}
