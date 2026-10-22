package exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the dog's name: ");
        String dogName = input.nextLine();
        System.out.print("Please enter the dog's height (in cm): ");
        int dogHeight = input.nextInt();
        input.nextLine();
        System.out.print("Please enter the dog's color: ");
        String dogColor = input.nextLine();
        System.out.print("Please enter the dog's age: ");
        int dogAge = input.nextInt();
        input.nextLine();


        Dog dog = new Dog(dogName, dogHeight, dogColor, dogAge);
        System.out.println("\nThe dog's name is " + dog.getName());
        System.out.println("The dog's height is " + dog.getHeight() + "cm");
        System.out.println("The dog's color is " + dog.getColor());
        System.out.println("The dog's age is " + dog.getAge());
        dog.eat();
        System.out.println(dog.cry() + "\n");


        System.out.print("Please enter the cat's name: ");
        String catName = input.nextLine();
        System.out.print("Please enter the cat's height (in cm): ");
        int catHeight = input.nextInt();
        input.nextLine();
        System.out.print("Please enter the cat's color: ");
        String catColor = input.nextLine();
        System.out.print("Please enter the cat's age: ");
        int catAge = input.nextInt();
        input.nextLine();

        Cat cat = new Cat(catName, catHeight, catColor, catAge);
        System.out.println("\nThe cat's name is " + cat.getName());
        System.out.println("The cat's height is " + cat.getHeight() + "cm");
        System.out.println("The cat's color is " + cat.getColor());
        System.out.println("The cat's age is " + cat.getAge());
        cat.eat();
        System.out.println(cat.cry() + "\n");

        ArrayList<IAnimal> animals = new ArrayList<>();
        animals.add(dog);
        animals.add(cat);

        for (IAnimal animal : animals) {
            System.out.println("The animal's name is " + animal.getName());
        }
    }
}
