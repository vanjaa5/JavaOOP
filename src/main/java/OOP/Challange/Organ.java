package OOP.Challange;

public class Organ {

    private String name;
    private String condition;

    public void getDetails(){
        System.out.println("Name: " + this.getName());
        System.out.println("Condition: "+ this.getCondition());
    }
    public Organ(String name, String condition) {
        this.name = name;
        this.condition = condition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }
}
