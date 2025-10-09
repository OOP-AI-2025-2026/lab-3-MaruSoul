package org.example.task2;

import org.task1.Box;
import org.task3.IntStack;

public class Main {
    public static void main(String[] args) {

        // Box task 1

        Box box = new Box(12, 28, 1);

        long surfaceArea = box.getSurfaceArea();
        long lateralSurfaceArea = box.getLateralSurfaceArea();
        long volume = box.getVolume();
        System.out.println("Surface Area: " + surfaceArea);
        System.out.println("Lateral Surface Area: " + lateralSurfaceArea);
        System.out.println("Volume: " + volume);

        // end Box

        Cart cart = new Cart();
        cart.add(new Item(1, "Samsung Galaxy S23", 27999));
        cart.add(new Item(2, "Lenovo IdeaPad 3", 19499));
        cart.add(new Item(3, "LG 55\" 4K Smart TV", 15999));
        cart.add(new Item(4, "Bosch Serie 6 Пральна машина", 14799));
        cart.add(new Item(5, "Samsung RB34 Холодильник", 22399));
        cart.add(new Item(6, "De'Longhi Magnifica S Кавоварка", 10599));
        cart.add(new Item(7, "Gorenje Електрична плита", 9999));
        cart.add(new Item(8, "Dyson V11 Пилосос", 16499));
        cart.add(new Item(9, "Samsung ME83K Мікрохвильова піч", 3199));
        cart.add(new Item(10, "Philips DryCare Фен", 1499));

        System.out.println(cart);

        cart.removeById(9);

        System.out.println(cart);

        Order order = new Order(1L, "John");
        String bill = order.formOrderBill(cart);
        System.out.println(bill);

        // task 3IntStack

        IntStack stack = new IntStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        System.out.println(stack.size());   // 5
        System.out.println(stack.peek());   // 50
        System.out.println(stack.pop());    // 50
        System.out.println(stack.pop());    // 40
        System.out.println(stack.isEmpty()); // false
        stack.clear();
        System.out.println(stack.isEmpty()); // true
    }
}