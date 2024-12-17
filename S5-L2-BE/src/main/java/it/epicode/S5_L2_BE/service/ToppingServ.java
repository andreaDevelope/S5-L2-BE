package it.epicode.S5_L2_BE.service;

import it.epicode.S5_L2_BE.pojo.Topping;
import it.epicode.S5_L2_BE.repo.ToppingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ToppingServ {
    @Autowired
    ToppingRepo tr;

    public void save(Topping t){
        tr.save(t);
    }
}
