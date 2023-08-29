package OOP.Challange;

import java.nio.charset.UnmappableCharacterException;

public class Patient {

    private String name;
    public int age;
    private LeftEye leftEye;
    private RightEye rightEye;
    private Heart heart;
    private Stomach stomach;
    private Skin skin;

    public Patient(String name, int age, LeftEye leftEye, RightEye rightEye, Heart heart, Stomach stomach, Skin skin) {
        this.name = name;
        this.age = age;
        this.leftEye = leftEye;
        this.rightEye = rightEye;
        this.heart = heart;
        this.stomach = stomach;
        this.skin = skin;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LeftEye getLeftEye() {
        return leftEye;
    }



    public RightEye getRightEye() {
        return rightEye;
    }



    public Heart getHeart() {
        return heart;
    }



    public Stomach getStomach() {
        return stomach;
    }



    public Skin getSkin() {
        return skin;
    }


}
