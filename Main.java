package org.example;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Toys> toys = new ArrayList<>();
        toys.add(new Toys());
        toys.add(new Toys());
        toys.add(new Toys());
        toys.add(new Toys());
        ArrayList<ShopBasket> baskets = new ArrayList<>();

        Toys.printList(toys);// вывод всех игрушек
        System.out.println("Draw toy: ");
        Toys.getitDraw(toys,baskets); // розыгрыш игрушки и добавление в корзину с последующим выводом
        System.out.println("----");
//        Toys.getitDraw(toys,baskets); // розыгрыш игрушки и добавление в корзину с последующим выводом
        System.out.println("List toy: ");
        Toys.printList(toys); // вывод всех оставшихся игрушек
        System.out.println("Toy in basket: ");
        ShopBasket.printBasket(baskets); // вывод игрушек в корзине

    }
}