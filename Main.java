package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the values of the array: ");
        int sum = 0;
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.println("Values are: " + arr[i]);
            sum = sum + arr[i];
        }
        System.out.println("Sum is: " + sum);*/

        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        System.out.println("Enter your radius: ");
        c1.radius = sc.nextFloat();
        c1.area();
        c1.PI=4.3f;

        /*Scanner sc = new Scanner(System.in);
        Student s1 = new Student();

        System.out.println("Enter your name: ");
        s1.name = sc.next();

        System.out.println("Enter your ID: ");
        s1.id = sc.nextInt();

        System.out.println("Enter your CGPA: ");
        s1.cgpa = sc.nextFloat();
        s1.display();*/

       /* Student s1 = new Student();
        s1.setvalue( "ABC", 12, 3.5f);
        s1.display();

        Student s2 = new Student();
        s2.name ="CDE";
        s2.id = 14;
        s2.display();*/
    }

}


