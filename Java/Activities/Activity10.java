package activities;

import java.util.HashSet;
import java.util.Objects;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("1"); //id
        hs.add("Hameedhul"); //forename
        hs.add("Arshadh"); //last name
        hs.add("A"); //initials
        hs.add("9876543210"); //phone
        hs.add("Yes"); //active

        System.out.println(hs);
        System.out.println(hs.size());
        hs.remove("Yes");
        hs.remove("No");

        if(hs.contains("Yes")){
            System.out.println("there");
        }
        else{
            System.out.println("not there");
        }

        System.out.println(hs);


    }
}
