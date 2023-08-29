package OOP.Challange;

import java.util.Scanner;

public class Heart extends Organ{
private int heartRate;


    public Heart(String name, String condition, int heartRate) {
        super(name, condition);
        this.heartRate = heartRate;
    }




    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }
    public void changeHeartRate(int rate){
        this.heartRate = rate;
        System.out.println("Heart rate is now " + rate);
    }
    Scanner s = new Scanner(System.in);
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Heart rate: " + this.getHeartRate());
        System.out.println("\t1. Change heart rate");
        int pom = s.nextInt();
        if(pom == 1){
            pom = s.nextInt();
            this.setHeartRate(pom);
            System.out.println("Heart rate is now " + this.getHeartRate());
        }

    }
}
