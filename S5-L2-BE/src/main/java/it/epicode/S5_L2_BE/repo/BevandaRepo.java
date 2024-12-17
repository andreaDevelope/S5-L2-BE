package it.epicode.S5_L2_BE.repo;

import it.epicode.S5_L2_BE.pojo.Bevanda;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BevandaRepo extends JpaRepository<Bevanda, Long> {
}
