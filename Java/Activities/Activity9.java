package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("Hameed");
        myList.add("Arshadh");
        myList.add("Sara");
        myList.add("Safreen");
        myList.add("Hameedhul");

        for(String name: myList){
            System.out.println(name);
        }

        System.out.println(myList.get(3));

        if(myList.contains("Arshadh")){
            System.out.println("Exists");
        }
        else{
            System.out.println("Doesn't exist");
        }

        System.out.println(myList.size());

        System.out.println(myList.remove("Hameedhul"));
        System.out.println(myList.size());


    }

}
