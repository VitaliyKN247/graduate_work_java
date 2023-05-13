package org.example;

import java.util.ArrayList;

public class Robot<T>
        extends Toys{
    String name_robot = "Robot"; // имя робота
    int chanse_robot = 35; // шанс выпадения робота


    public Robot() {
        addinToy();
    }

    /**
     * переопеределение метода по добавлению игрушки
     */
    public void addinToy(){
        super.name_toy = name_robot;
        super.chance = chanse_robot;
    }

    /**
     * вывод списка всех роботов
     */
    protected static void printListRobor(ArrayList<Robot> robots){
        for(Robot i : robots){
            System.out.println(i);
        }
    }

    public String getName_robot() {
        return name_robot;
    }

    public void setName_robot(String name_robot) {
        this.name_robot = name_robot;
    }

    public int getChanse_robot() {
        return chanse_robot;
    }

    public void setChanse_robot(int chanse_robot) {
        this.chanse_robot = chanse_robot;
    }
}
