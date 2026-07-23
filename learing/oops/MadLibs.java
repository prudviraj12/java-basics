// package oops;
import java.util.Scanner;

public class MadLibs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== MAD LIBS GAME =====");

        System.out.print("Enter a person's name: ");
        String name = sc.nextLine();

        System.out.print("Enter a place: ");
        String place = sc.nextLine();

        System.out.print("Enter an animal: ");
        String animal = sc.nextLine();

        System.out.print("Enter a food: ");
        String food = sc.nextLine();

        System.out.print("Enter an adjective: ");
        String adjective = sc.nextLine();

        System.out.print("Enter a verb ending with -ing: ");
        String verb = sc.nextLine();

        System.out.print("Enter a color: ");
        String color = sc.nextLine();

        System.out.println("\n----- Your Story -----\n");

        System.out.println(name + " went to " + place + " on a sunny day.");
        System.out.println("Suddenly, a " + color + " " + animal + " came " + verb + " towards them.");
        System.out.println("Everyone became " + adjective + ".");
        System.out.println("To calm the " + animal + ", " + name + " offered some " + food + ".");
        System.out.println("The " + animal + " happily ate the " + food + " and became friends with " + name + ".");
        System.out.println("It was the funniest adventure ever!");

        sc.close();
    }
}