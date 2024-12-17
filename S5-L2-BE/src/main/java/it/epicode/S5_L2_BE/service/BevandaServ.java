package it.epicode.S5_L2_BE.service;

import it.epicode.S5_L2_BE.pojo.Bevanda;
import it.epicode.S5_L2_BE.repo.BevandaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BevandaServ {
    @Autowired
    BevandaRepo br;

    public void save(Bevanda b){
        br.save(b);
    }
}
