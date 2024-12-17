package it.epicode.S5_L2_BE.repo;

import it.epicode.S5_L2_BE.pojo.Topping;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ToppingRepo extends JpaRepository<Topping, Long> {
}
