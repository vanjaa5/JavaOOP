package key.words;

public class TestClass {

    private int age;
    private String color;
    private class testInnerClass{
        private String name;

        public testInnerClass(String name) {
            this.name = name;
        }
    }

    private void printAge(){
        System.out.println("Age: " + age);
    }


}
