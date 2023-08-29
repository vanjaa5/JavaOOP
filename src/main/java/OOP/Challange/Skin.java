package OOP.Challange;

public class Skin extends Organ{

    private String color;
    private int softness;

    public Skin(String name, String condition, String color, int softness) {
        super(name, condition);
        this.color = color;
        this.softness = softness;
    }

    @Override
    public void getDetails() {
        super.getDetails();
        System.out.println("Color: "+ this.getColor());
        System.out.println("Softness: " + this.getSoftness());
    }

    public String getColor() {
        return color;
    }



    public int getSoftness() {
        return softness;
    }


}
