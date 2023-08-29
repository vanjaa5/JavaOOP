package oop1;

public class Main {

    public static void main(String[] args){
//        Phone iPhone = new Phone("pera",10,8,8);
//        System.out.println(iPhone.getName());
//
//        iPhone.playMusic("Dior");
//        iPhone.playMusic("Plavi Slon");
//
//        Phone pixel = new Phone("Pixel 3",16);

        Bird phoneix = new Bird("Pera","Fire",2,true,4);
        System.out.println(phoneix.getName());
        phoneix.eat("Meat");

        System.out.println(phoneix.getWings());
        phoneix.fly(100);
    }
}
