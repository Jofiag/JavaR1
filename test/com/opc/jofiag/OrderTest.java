package com.opc.jofiag;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class OrderTest
{
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStream() { System.setOut(new PrintStream(outContent)); }

    @AfterEach
    public void restoreStream() { System.setOut(System.out); }

    Order order = new Order();


    @Test
    public void Given_Chicken_When_DisplayMenuSelected_Then_DisplayChickenSentence(){
        order.displayMenuSelected(1);
        assertEquals("Vous avez choisi le menu : Poulet\n", outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_Beef_When_DisplayMenuSelected_Then_DisplayBeefSentence(){
        order.displayMenuSelected(2);
        assertEquals("Vous avez choisi le menu : Boeuf\n", outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_Vegetarian_When_DisplayMenuSelected_Then_DisplayVegetarianSentence(){
        order.displayMenuSelected(3);
        assertEquals("Vous avez choisi le menu : végétarien\n", outContent.toString().replace("\r\n", "\n"));
    }

}
