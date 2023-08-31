package activities;

public class Activity2 {
    public static void main(String args[]){
        int[] array = {10,77,10,54,-11,10};
        int condition = 30;
        int sum = 0;
        for(int element: array){
            if(element == 10){
                sum = sum + element;
            }
        }
        if(sum == condition){
            System.out.println("Sum of 10s is equal to " + condition);
        }
        else{
            System.out.println("Sum of 10s is not equal to " + condition);
        }
    }
}
