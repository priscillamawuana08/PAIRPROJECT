package Main;

import LiskovSubstitution.Engine;
import LiskovSubstitution.MotorCar;
import OpenClosedPrinciples.Guitar;
import OpenClosedPrinciples.SuperCoolGuitarWithFlames;
import SingleResponsibilityPrinciple.Book;

public class Main {
    public static void main(String[] args) {
        //creating an object out of the book (instantiating)
        Book book1 = new Book("The lion and king","Priscilla","The power of the tongue is mighty");
        System.out.println(book1.getAuthor());
        System.out.println(book1.getText());
        System.out.println(book1.getName());



        // instantiating Guitar
        Guitar guitar = new Guitar("A sound","model one",5);
        System.out.println(guitar.getMake());
        SuperCoolGuitarWithFlames superGuitar = new SuperCoolGuitarWithFlames("A sound",
                "model two",4,"Green");

        System.out.println(superGuitar.getFlameColor());


        // instantiating a motorCar
//        MotorCar motor = new MotorCar(Engine.ON);
//        System.out.println("The engine is on");
    }
}
