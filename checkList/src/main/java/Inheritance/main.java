package Inheritance;

public class main {
    public static void main(String[] args) {
// An instance of a Base Class
        Base base = new Base("queen Size","Office chair","Study table");
        System.out.println("I am sitting on an" + " " + base.sitDown() + ".");

//The Sub object is able to reuse the methods inherited from the Base Object.
        Sub subClass = new Sub("King size","Kitchen chair","Dinning table","high");
        System.out.println("I am sleeping on a " + subClass.sleep() + " " + "bed" + ".");
        System.out.println(" I am jumping " + " " + subClass.jump() + ".");
    }
}
