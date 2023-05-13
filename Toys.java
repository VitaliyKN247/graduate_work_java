package org.example;

import java.awt.Robot;
import java.util.*;
import java.util.stream.IntStream;


public class Toys
    extends ShopBasket
        implements Chanse , Comparable<Toys>, AddToy{
    private int id ; // id игрушки
    private static int nextId = 1; // следуюший id по списку

    private int rmvid = 1;

    private static int quantity = 0; // количество игрушек
    int chance; // шанс вытащить игрушку в зависимости от веса
    String name_toy; // название игрушки
    Scanner toy = new Scanner(System.in); // принятие данных от пользователя

    String name_r = "robot";
    String name_l = "lion";



    public Toys(int id, int quantity, int chance, String name_toy) {
        this.id = id;
        this.quantity = quantity;
        this.chance = chance;
        this.name_toy = name_toy;
    }

    public Toys() {
        addId();
        addinToy();
        addQuantity();
    }



    /**
     * переопределение интерфейса AddToy
     */
    @Override
    public void addinToy(){
        this.name_toy = name_toy;
        addToy();  //вернуть?
        chance = (int) (Math.random() * 99) + 1;
    }


    /**
     * метод по нахождению последнего элемента в списке
     * @param list
     */
    protected static void callLast (ArrayList<Toys> list){
        Collections.sort(list);
    }

    /**
     * вывод списка всех игрушек
     * @param list
     */
    protected static void printList (ArrayList<Toys> list){
        for(Toys toy : list) {
            System.out.println(toy);
        }
    }

    /**
     * метод рандома игрушек
     * @param toys
     */
    public static void getitDraw(ArrayList<? extends Toys> toys, ArrayList<ShopBasket> baskets){
        int index = random.nextInt(toys.size());
        Toys item = toys.get(index);
        System.out.println(item);
//        baskets = toys.get(index);
//        System.out.println("Toy in basket: ");
        baskets.add(toys.get(index));
        toys.remove(index);
        nextId --;
        quantity --;


    }


    /**
     * перегруженный метод compareTo
     * позволяет сортировать массив по шансу выпадения игрушки
     * @param comparestu
     * @return
     */
    public int compareTo(Toys comparestu){
        int comparege = ((Toys)comparestu).getChance();
        return this.chance - comparege;
    }


    /**
     * Перегруженный метод toString
     * @return возвращение значения приведенного к строке в методе printToy
     */
    public String toString(){
        return String.valueOf(printToy());
    }

    /**
     * Метод по выводу кол-ва игрушек
     */
    public static void printQuantityToys(){
        System.out.println("Количество игрушек: " + quantity);
    }

    /**
     * метод по выводу информации об игрушки
     */
    private String printToy(){
        String info ="id  " + id + "\nName: " + getName_toy() + "\nChance: " + chance + " %\n";
        return info;
    }

    /**
     * метод по добавлению количества игрушек
     * @return
     */
    public int addQuantity(){
        quantity ++;
        return quantity;
    }


    /**
     * метод по добавлению названия игрушки
     */
    public void addToy(){
        System.out.println("Введите имя игрушки: ");
        name_toy = toy.next();
    }

    /**
     * Метод по изменению шанса выпадения игрушки(веса)
     */
    @Override
    public void editChanse() {
        System.out.println("Введите каким способом изменит шанс выпадения игрушки: \n1.Установить параметры вручную \n" +
                "2.Установить с помощью рандома");
        int choise = toy.nextInt();
        switch (choise) {
            case 1:
                System.out.println("Установите значения: ");
                choise = toy.nextInt();
                chance = choise;
                break;
            case 2:
                chance = (int) (Math.random() * 99) + 1;
                break;
            default:
                System.out.println("Нет такого варианта");
                break;
        }
    }


    /**
     * Метод по добавлению нового id игрушки
     * @return
     */
    protected final int addId() {
        id = nextId ++;
        return id;
    }

    /**
     * Метод по уменьшению id игрушки на 1
     * @return
     */
    protected final int minusId() {
        rmvid= nextId --;
        return rmvid;
    }

    public int minusquantity(){
        quantity --;
        return quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getNextId() {
        return nextId;
    }

    public static void setNextId(int nextId) {
        Toys.nextId = nextId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }

    public String getName_toy() {
        return name_toy;
    }

    public void setName_toy(String name_toy) {
        this.name_toy = name_toy;
    }


}
