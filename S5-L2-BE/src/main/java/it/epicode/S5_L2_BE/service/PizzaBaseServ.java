package it.epicode.S5_L2_BE.service;

import it.epicode.S5_L2_BE.pojo.PizzaBase;
import it.epicode.S5_L2_BE.pojo.Topping;
import it.epicode.S5_L2_BE.repo.PizzaBaseRepo;
import it.epicode.S5_L2_BE.repo.ToppingRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PizzaBaseServ {

    @Autowired
    PizzaBaseRepo pr;

    @Autowired
    ToppingRepo tr;

    @Transactional
    public void save(PizzaBase p, List<Topping> t){

        tr.saveAll(t);
        pr.save(p);
    }

}
