// package atal;

// public class ex {
// public static void main(String[] args) {
// System.out.println("Hello");
// }
// }
// class Manager extends Thread {

// public void run() {
// for (int i = 1; i <= 5; i++) {
// System.out.println("Manager is checking reports " + i);

// try {
// Thread.sleep(1000);
// } catch (InterruptedException e) {
// System.out.println(e);
// }
// }
// }
// }

// class Employee extends Thread {

// public void run() {
// for (int i = 1; i <= 5; i++) {
// System.out.println("Employee is working on task " + i);

// try {
// Thread.sleep(1000);
// } catch (InterruptedException e) {
// System.out.println(e);
// }
// }
// }
// }

// public class Office {

// public static void main(String[] args) {

// Manager m = new Manager();
// Employee e = new Employee();

// m.start(); // Starts Manager thread
// e.start(); // Starts Employee thread

// System.out.println("Office Started...");
// }
// }
package atal;

class Manager extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Manager is checking reports " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Employee extends Thread {

    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Employee is working on task " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class Office {

    public static void main(String[] args) {

        Manager manager = new Manager();
        Employee employee = new Employee();

        manager.start();
        employee.start();

        System.out.println("Office Started...");
    }
}