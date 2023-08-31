package activities;

interface BicycleParts{
    public int gears = 0;
    public int speed = 0;
}

interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts, BicycleOperations{
    public int gears;
    public int speed;

    public Bicycle(int gears, int speed){
        this.gears = gears;
        this.speed = speed;
    }

    public void bicyleDesc(){
        System.out.println("Bicycle has " + this.gears + " gears.");
        System.out.println("Bicycle is running at " + this.speed + " kph.");
    }

    public void applyBrake(int decrement) {
        this.speed -= decrement;
    }

    public void speedUp(int increment) {
        this.speed += increment;
    }
}

class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gears, int speed, int height) {
        super(gears, speed);
        this.seatHeight = height;
    }

    public void setSeatHeight(int height){
        this.seatHeight = height;
    }

    public void bicyleDesc(){
        System.out.println("Bicycle has " + this.gears + " gears.");
        System.out.println("Bicycle is running at " + this.speed + " kph.");
        System.out.println("Bicycle has a seat height of " + this.seatHeight + " cms.");
    }

}

public class Activity7 {
    public static void main(String args[]){
        MountainBike MountBike = new MountainBike(6, 30, 75);
        MountBike.bicyleDesc();
        MountBike.speedUp(10);
        MountBike.applyBrake(5);
        MountBike.bicyleDesc();
    }
}
