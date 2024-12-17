package it.epicode.S5_L2_BE.repo;

import it.epicode.S5_L2_BE.pojo.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepo extends JpaRepository<Menu, Long> {
}
