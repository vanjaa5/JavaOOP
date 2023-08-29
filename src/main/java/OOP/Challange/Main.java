package OOP.Challange;

import java.util.Scanner;

public class Main {



    public static void main(String[] args){
        Patient patient = new Patient("Pera",30,new LeftEye("Eye","None","Blue",false),
        new RightEye("Eye","None","Blue",true),
        new Heart("Heart","None",75),
        new Stomach("Stomach","None",true),
        new Skin("Skin","Burned","No rights",4));

        System.out.println("Chose an Organ: ");
        System.out.println("\t1. Left Eye");
        System.out.println("\t2. Right Eye");
        System.out.println("\t3. Heart");
        System.out.println("\t4. Stomach");
        System.out.println("\t5. Skin");
        System.out.println("\t6. Quit");

        Scanner s = new Scanner(System.in);
        int pom = s.nextInt();
        while(pom <6){
            switch (pom) {
                case 1:
                    patient.getLeftEye().getDetails();
                    break;

                case 2:
                    patient.getRightEye().getDetails();
                    break;
                case 3:
                    patient.getHeart().getDetails();
                    break;

                case 4:
                    patient.getStomach().getDetails();
                    break;
                case 5:
                    patient.getSkin().getDetails();
                    break;
                default: pom =6;

            }
            System.out.println("Chose an Organ: ");
            System.out.println("\t1. Left Eye");
            System.out.println("\t2. Right Eye");
            System.out.println("\t3. Heart");
            System.out.println("\t4. Stomach");
            System.out.println("\t5. Skin");
            System.out.println("\t6. Quit");
            pom = s.nextInt();
        }

    }
}
