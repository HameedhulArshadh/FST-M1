package activities;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;
import java.lang.Integer;
public class Activity13 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter integers one by one with an enter, first sequence which is not an integer will stop this");
        while(scan.hasNextInt()){
            list.add(scan.nextInt());
        }
        Random random = new Random();
        int index = random.nextInt(list.size());
        System.out.println("Randomly selected index: " + index);
        System.out.println("Value at index " + index + " is " + list.get(index));
        System.out.println("Entire list:\n" + list);
    }
}
