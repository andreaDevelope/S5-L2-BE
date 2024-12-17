package it.epicode.S5_L2_BE.repo;

import it.epicode.S5_L2_BE.pojo.PizzaBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PizzaBaseRepo extends JpaRepository<PizzaBase, Long> {
}
