package it.epicode.S5_L2_BE.service;

import it.epicode.S5_L2_BE.pojo.Bevanda;
import it.epicode.S5_L2_BE.pojo.Menu;
import it.epicode.S5_L2_BE.pojo.PizzaBase;
import it.epicode.S5_L2_BE.repo.MenuRepo;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServ {
    @Autowired
    MenuRepo mr;

    public void save(List<Bevanda> b, List<PizzaBase> p, Menu m){
        for(Bevanda be: b){
            m.getBevande().add(be);
        }
        for(PizzaBase pizza: p){
            m.getPizze().add(pizza);
        }
        mr.save(m);
    }
}
