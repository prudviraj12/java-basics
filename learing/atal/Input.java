// package atal;
import java.util.Scanner;
public class input{
    public static void main(String[] args ){
        Scanner sc=new Scanner  (System.in);
        // System.out.println("enter your name");
        // String s=sc.nextLine();
        // System.out.println("hello "+ s);
        System.out.print("length:");
        int len =sc.nextInt();
        sc.nextLine();
        System.out.print("breadth: ");
        int bre = sc.nextInt();
        System.out.print("area of rectangle: " + (len*bre));
        sc.close();

    }
}

