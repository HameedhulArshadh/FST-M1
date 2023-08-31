package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Activity4 {
    public static List setup(){
        Scanner scan = new Scanner(System.in);
        List <Integer> nums = new ArrayList<Integer>();
        int size = 0;

        System.out.print("Enter the size of the list: ");
        size = scan.nextInt();

        for(int i = 0; i < size; i++){
            System.out.print("Enter your digit: ");
            nums.add(scan.nextInt());
        }
        return nums;
    }

    public static void arrayPrinter(int[] numbers){
        int i = 0;
        while(i < numbers.length){
            System.out.print(numbers[i]);
            i++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,4,3,5,7,8,6};
        int i = 0;

        while(i < numbers.length-1){
            if(numbers[i] > numbers[i+1]){
                int mid = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = mid;
            }
            else{
                i++;
            }
            arrayPrinter(numbers);
        }




    }



}
