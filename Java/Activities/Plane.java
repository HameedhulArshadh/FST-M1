package activities;

import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Plane{
    private List<String> passengers;
    private int maxPassengers;
    private String lastTimeTookOf;
    private String lastTimeLanded;

    public Plane(int max){
        this.maxPassengers = max;
        this.passengers = new ArrayList<>();
    }

    public void onboard(String passenger){
        this.passengers.add(passenger);
    }

    public String takeOff(){
        // need to ask
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.lastTimeTookOf = dtf.format(now);
        return this.lastTimeTookOf;
    }

    public void land(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        this.lastTimeLanded = dtf.format(now);
        this.passengers.clear();
    }

    public String getLastTimeLanded(){
        return this.lastTimeLanded;
    }

    public List<String> getPassengers(){
        return this.passengers;
    }
}