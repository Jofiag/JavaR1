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
    public void Given_Nothing_When_DisplayMenuSelection_Then_DisplayText() {
        order.displayAvailableMenu();
        assertEquals(false, outContent.toString().isEmpty());
    }
    @Test
    public void Given_Chicken_When_AskForMenuSelected_Then_ShouldDisplayCorrectSentence(){
        order.displayMenuSelected(1);
        assertEquals("Vous avez choisi le menu 1\n", outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_Beef_When_AskForMenuSelected_Then_ShouldDisplayCorrectSentence(){
        order.displayMenuSelected(2);
        assertEquals("Vous avez choisi le menu 2\n", outContent.toString().replace("\r\n", "\n"));
    }
    @Test
    public void Given_Vegetarian_When_AskForMenuSelected_Then_ShouldDisplayCorrectSentence(){
        order.displayMenuSelected(3);
        assertEquals("Vous avez choisi le menu 3\n", outContent.toString().replace("\r\n", "\n"));
    }

}
