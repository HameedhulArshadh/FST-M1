package activities;

public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane boeing1 = new Plane(10);
        System.out.println(boeing1.takeOff());
        System.out.println(boeing1.getPassengers());
        Thread.sleep(5000);
        boeing1.land();
        System.out.println(boeing1.getLastTimeLanded());
    }
}
