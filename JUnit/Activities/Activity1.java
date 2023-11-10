package activities;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Activity1 {
    static ArrayList<String> list; // setting the test fixtures

    @BeforeEach
    public void setup(){
        // initiates the list arraylist with values

        list = new ArrayList<String>();
        list.add("Alpha");
        list.add("Beta");
    }

    @Test
    public void insertTest(){
        // asserting the size of the list to be 2
        assertEquals(2, list.size(), "List Size is not 2");

        // inserting a new element and checking the size of the list
        list.add("Gamma");
        assertEquals(3, list.size(), "Wrong Size");
        assertEquals("Gamma", list.get(2));
    }

    @Test
    public void replaceTest(){
        // asserting the size of the list to be 2
        assertEquals(2, list.size(), "List Size is not 2");

        // inserting a new element and checking the size of the list
        list.add("Gamma");
        assertEquals(3, list.size(), "Wrong Size");

        // replacing the values at index 1
        list.set(1, "beta");
        assertEquals("beta", list.get(1), "Wrong Element");

    }
}
