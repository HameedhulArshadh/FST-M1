package activities;
import java.util.Scanner;
public class Activity3 {
    public static void main(String[] args) {

        int Earth = 31557600;
        double Mercury = 0.2408467;
        double Venus = 0.61519726;
        double Mars = 1.8808158;
        double Jupiter = 11.862615;
        double Saturn = 29.447498;
        double Uranus = 84.016846;
        double Neptune = 164.79132;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Earth age in seconds: ");
        long seconds = scan.nextInt();
        double earthYears = (double)seconds/Earth;
        System.out.printf("Your age in Earth years: %.2f\n",earthYears);
        System.out.printf("Your age in Mercury years: %.2f\n",earthYears/Mercury);
        System.out.printf("Your age in Venus years: %.2f\n",earthYears/Venus);
        System.out.printf("Your age in Mars years: %.2f\n",earthYears/Mars);
        System.out.printf("Your age in Jupiter years: %.2f\n",earthYears/Jupiter);
        System.out.printf("Your age in Saturn years: %.2f\n",earthYears/Saturn);
        System.out.printf("Your age in Uranus years: %.2f\n",earthYears/Uranus);
        System.out.printf("Your age in Neptune years: %.2f\n",earthYears/Neptune);
    }
}
