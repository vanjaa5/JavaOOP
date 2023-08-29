package Concurrency;

public class Main {
    public static void main(String[] args){
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//               for(int i =0;i<5;i++){
//                   System.out.println("Printing " + i + " in a worker thread");
//                   try {
//                       Thread.sleep(1000);
//                   } catch (InterruptedException e) {
//                       throw new RuntimeException(e);
//                   }
//               }
//            }
//        });
//        thread.start();
//
//        for(int i =0;i<5;i++){
//            System.out.println("Printing " + i + " in a main thread");
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
        int a = 2;
        int b = 0;

        String name = null;
        try{
            name.equals("Meisam");
        }
        catch (NullPointerException e){
            System.out.println("Name was null");
        }

    }
}
