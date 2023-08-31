package activities;

public class Car {
    protected String color;
    protected String transmission;
    protected int make;
    protected int tyres;
    protected int doors;

    public Car(){
        this.tyres = 4;
        this.doors = 4;
    }

    void displayCharacteristics(){
        System.out.println("Color: " + this.color);
        System.out.println("Transmission: " + this.transmission);
        System.out.println("Make: " + this.make);
        System.out.println("Tyres: " + this.tyres);
        System.out.println("Doors: " + this.doors);
    }

    void accelerate(){
        System.out.println("Car is moving forward.");
    }

    void brake(){
        System.out.println("Car is stopped.");
    }

}
