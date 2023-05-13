package org.example;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ShopBasket
//    extends Toys
    {
    ShopBasket basket; // корзина с выигравшими игрушками
    static Random random = new Random(); // подключение рандома
    ArrayList<ShopBasket> baskets = new ArrayList<>();
    FileWriter file;
    String listString = baskets.stream().map(Object::toString)
                .collect(Collectors.joining(", "));

    public ShopBasket() {
    }

    /**
     * метод по выбору и печати последнего элемента в ArrayList
     * @param lists
     */
    public ShopBasket drawToy(ArrayList<Toys> lists,ShopBasket basket){
        basket = lists.get(lists.size()-1);
        System.out.println(basket);
        return basket;
    }

    public void addToFile(ShopBasket baskets) throws IOException {
//        for (ShopBasket toy : baskets){
            file.write(baskets.toString());
//        }
    }

    public static void printBusket (ArrayList<ShopBasket> baskets){
        for (ShopBasket list : baskets){
            System.out.println(list);
        }
    }



//    /**
//     * метод по выбору игрушки с шансами и перемещению ее в корзину
//     * @param toys
//     */
//    public static void getDraw(ArrayList<Toys> toys, ArrayList<ShopBasket> baskets){
//        for (int randomNumsCount = 0; randomNumsCount < 1; randomNumsCount++) {
//            int index = random.nextInt(toys.size());
//            for (int i = 0; i < toys.size(); i++) {
//                index -= toys.size();
//                if (index < 0) {
//                    System.out.println("Random\n" + toys.get(i));
//                    baskets.add(toys.get(i));
//                    toys.remove(i);
//                    break;
//                }
//
//            }
//        }
//    }







        /**
         * печать всего массива корзины
         * @param baskets
         */
    protected static void printBasket(ArrayList<ShopBasket> baskets){
        for (ShopBasket i : baskets){
            System.out.println(baskets);
        }
    }


}
