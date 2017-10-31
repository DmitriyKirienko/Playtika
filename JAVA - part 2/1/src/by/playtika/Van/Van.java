package by.playtika.Van;

import by.playtika.Coffee.*;
import java.util.ArrayList;

public class Van {
    private ArrayList<Coffee> coffelist = new ArrayList<>();
    private int weight;
    private int value;
    private int amount;

    public Van() {
        this.weight = 0;
        this.value = 0;
        this.value = 1;
    }

    public void addCoffee(Coffee n){
        this.coffelist.add(n);
        this.weight+=n.getWeight();
        this.amount+=1;
        this.value+=n.getValue();
    }
}
