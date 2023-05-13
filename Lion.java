package org.example;

import java.util.ArrayList;

public class Lion
    extends Toys {
    String name_lion = "Lion";
    int chanse_lion = 50;


    public Lion() {
        addinToy();
    }

    /**
     * вывод списка всех львов
     */
    protected static void printListLion(ArrayList<Lion> lions){
        for(Lion i : lions){
            System.out.println(i);
        }
    }

    /**
     * переопеределение метода по добавлению игрушки
     */
    public void addinToy(){
        super.name_toy = name_lion;
        super.chance = chanse_lion;
    }

    public String getName_lion() {
        return name_lion;
    }

    public void setName_lion(String name_lion) {
        this.name_lion = name_lion;
    }

    public int getChanse_lion() {
        return chanse_lion;
    }

    public void setChanse_lion(int chanse_lion) {
        this.chanse_lion = chanse_lion;
    }
}
