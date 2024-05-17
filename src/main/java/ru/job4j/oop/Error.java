package ru.job4j.oop;

public class Error {
    private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public Error() {
    }

    public void printInfo() {
        System.out.println("Active: " + active);
        System.out.println("Status: " + status);
        System.out.println("Message: " + message);
    }

    public static void main(String[] args) {
        Error error = new Error();
        error.printInfo();
        Error error1 = new Error(true, 5, "Okey");
        error1.printInfo();
        Error error2 = new Error(false, 6, "Not Okey");
        error2.printInfo();
        Error error3 = new Error(true, 7, "Super");
        error3.printInfo();
    }
}
