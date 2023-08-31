package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> colours = new HashMap<>();
        colours.put(1, "Violet");
        colours.put(2, "Indigo");
        colours.put(3, "Blue");
        colours.put(4, "Green");
        colours.put(5, "Yellow");

        colours.remove(2);

        if(colours.containsValue("Green")){
            System.out.println("Has Green");
        }
        else{
            System.out.println("No Green");
        }

        System.out.println(colours.size());

    }

}
