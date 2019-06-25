package com.opc.jofiag;

public class Order {

    /**
     * Display all available menu in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix du menu");
        System.out.println("1-Poulet");
        System.out.println("2-Boeuf");
        System.out.println("3-Vegetarien");
        System.out.println("Quel est votre choix ?");
    }

    /**
     * Display menu selected.
     * @param menuNb the selected menu.
     */

    public void displayMenuSelected(int menuNb){
        switch (menuNb){
            case 1:
                System.out.println("Vous avez choisi le menu : Poulet");
                break;
            case 2:
                System.out.println("Vous avez choisi le menu : Boeuf");
                break;
            case 3:
                System.out.println("Vous avez choisi le menu : végétarien");
                break;
            default:
                System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
                break;
        }
    }
}
