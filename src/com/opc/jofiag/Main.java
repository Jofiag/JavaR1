package com.opc.jofiag;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Order order = new Order();
        order.displayAvailableMenu();

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        order.displayMenuSelected(choice);
    }
}
