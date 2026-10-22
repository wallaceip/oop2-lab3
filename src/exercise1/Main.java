package exercise1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the dog's name: ");
        String dogName = input.nextLine();
        Dog dog = new Dog(dogName, "Brown", 6);
        System.out.println("The dog's name is " + dog.getName());
        System.out.println("The dog's color is " + dog.getColor());
        System.out.println("The dog's age is " + dog.getAge());
        dog.eat();

        System.out.print("\nPlease enter the cat's name: ");
        String catName = input.nextLine();
        Cat cat = new Cat(catName, "Orange", 3);
        System.out.println("The cat's name is " + cat.getName());
        System.out.println("The cat's color is " + cat.getColor());
        System.out.println("The cat's age is " + cat.getAge());
        cat.eat();

    }
}
