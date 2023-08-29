package OOP.Challange;

import java.util.Scanner;

public class Eye extends Organ{
    private String color;
    private boolean opened;

    public Eye(String name, String condition, String color, boolean opened) {
        super(name, condition);
        this.color = color;
        this.opened = opened;
    }

    public String getColor() {
        return color;
    }



    public boolean isOpened() {
        return opened;
    }



    public void openClose(){
        if(opened == true){
            opened = false;
            System.out.println("Eye is closed");
        }
        else {
            opened = true;
            System.out.println("Eye is opened");
        }
    }
    Scanner s= new Scanner(System.in);
    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: " + this.getColor());
        if(this.isOpened()){
            System.out.println("\t1. Close the Eye");
            int pom = s.nextInt();
            if(pom == 1){
                this.openClose();
            }
        }
        else{
            System.out.println("\t1. Open the Eye");
            int pom = s.nextInt();
            if(pom == 1){
                this.openClose();
            }
        }
    }
}
