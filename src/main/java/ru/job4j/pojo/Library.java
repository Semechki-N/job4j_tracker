package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Clean code", 20);
        Book second = new Book("Glamur", 55);
        Book third = new Book("Famous", 100);
        Book fourth = new Book("Game of Thrones", 300);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            System.out.println("Книга " + book.getName() + "  - cодержит " + book.getCount() + " страниц.");
        }
        books[0] = fourth;
        books[3] = first;

        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book.getName().equals("Clean code")) {
                System.out.println("Книга " + book.getName() + "  - cодержит " + book.getCount() + " страниц.");
            }
        }
    }
}
