package OOP.Challange;

import java.util.Scanner;

public class Stomach extends Organ{

    private boolean isEmpty;

    public Stomach(String name, String condition, boolean isEmpty) {
        super(name, condition);
        this.isEmpty = isEmpty;
    }

    public void Digest(){
        System.out.println("The stomach is digesting now");
    }
Scanner s = new Scanner(System.in);

    public boolean isEmpty() {
        return isEmpty;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        if(this.isEmpty)
            System.out.println("Need to be feed");
        else
            System.out.println("Stomach is full");
        System.out.println("\t1. Digest");
        int pom = s.nextInt();
        if(pom ==1) {
            this.Digest();
        }
    }
}
