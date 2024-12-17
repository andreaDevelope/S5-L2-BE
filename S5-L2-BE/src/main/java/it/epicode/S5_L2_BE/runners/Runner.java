package it.epicode.S5_L2_BE.runners;

import it.epicode.S5_L2_BE.pojo.Margherita;
import it.epicode.S5_L2_BE.pojo.Topping;
import it.epicode.S5_L2_BE.service.PizzaBaseServ;
import it.epicode.S5_L2_BE.service.ToppingServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Runner implements ApplicationRunner {

    @Autowired
    private PizzaBaseServ pis;

    @Autowired
    private ToppingServ ts;



    @Override
    public void run(ApplicationArguments args) throws Exception {
        Topping pomodoro = new Topping("Pomodoro", 1.5);
        Topping mozzarella = new Topping("Mozzarella", 1.5);
        ts.save(pomodoro);
        ts.save(mozzarella);



        Margherita margherita = new Margherita();
        List<Topping> toppings = new ArrayList<>();
        toppings.add(pomodoro);
        toppings.add(mozzarella);

        pis.save(margherita, toppings);
    }

}
