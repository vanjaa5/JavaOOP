package oop3;

public class Main {
    public static void main(String[] args){
//
//        Car mercedes = new Car("Mercedes AMG",2,"Bez prava", new Engine("Renault",8000));
//
//       Engine engine = mercedes.getEngine();
//
//
//        System.out.println(mercedes.getName());
//        System.out.println("Engine Model: " + mercedes.getEngine().getModel());

//    Car mercedes = null;
//    if(mercedes != null){
//        mercedes.getEngine();
//
//    }
//    else
//        System.out.println("The car was null");
//
//        final int a = 5;
//        a++;
        final  Engine engine = new Engine("Renault",8000);
        
        engine.setRpm(10000);
    }
}
