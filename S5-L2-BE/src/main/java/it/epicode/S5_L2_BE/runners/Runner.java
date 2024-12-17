package it.epicode.S5_L2_BE.runners;

import it.epicode.S5_L2_BE.pojo.Bevanda;
import it.epicode.S5_L2_BE.pojo.Menu;
import it.epicode.S5_L2_BE.pojo.PizzaBase;
import it.epicode.S5_L2_BE.pojo.Topping;
import it.epicode.S5_L2_BE.service.BevandaServ;
import it.epicode.S5_L2_BE.service.MenuServ;
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

    @Autowired
    private MenuServ ms;

    @Autowired
    private BevandaServ bs;



    @Override
    public void run(ApplicationArguments args) throws Exception {
        Menu menu = new Menu();
        PizzaBase margherita = new PizzaBase();
        margherita.setKcal(5000L);
        margherita.setPrice(5.5);
        margherita.setNutritionFacts("calorie: " + margherita.getKcal());
        Bevanda bevanda = new Bevanda();
        bevanda.setName("coca-cola");
        bevanda.setKcal(3000L);
        bevanda.setNutritionFacts("calorie: " + bevanda.getKcal());
        bevanda.setPrice(2.5);
        Topping pomodoro = new Topping("Pomodoro", 1.5);
        Topping mozzarella = new Topping("Mozzarella", 1.5);
        List<Topping> toppings = new ArrayList<>();
        List<PizzaBase> pizze = new ArrayList<>();
        List<Bevanda> bevande = new ArrayList<>();
        bevande.add(bevanda);

        pizze.add(margherita);

        toppings.add(pomodoro);
        toppings.add(mozzarella);

        pis.savePizzaAndToppings(margherita, toppings);
        bs.save(bevanda);

        ms.save(bevande,pizze,menu);


    }

}
