package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book cinderella = new Book("Cinderella", 15);
        Book vii = new Book("Vii", 50);
        Book warPeace = new Book("War and peace", 1000);
        Book cleanCode = new Book("Clean code", 350);
        Book[] books = new Book[4];
        books[0] = cinderella;
        books[1] = vii;
        books[2] = warPeace;
        books[3] = cleanCode;
        for (int index = 0; index < books.length; index++) {
            Book item = books[index];
            System.out.println(item.getName() + ", количество страниц: "
                    + item.getNumberOfPages() + "."
            );
        }
        System.out.println("\nПереставлены позиции с индексом 0 и 3.");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int index = 0; index < books.length; index++) {
            Book item = books[index];
            System.out.println(item.getName() + ", количество страниц: "
                    + item.getNumberOfPages() + "."
            );
        }
        System.out.println("\nПоиск книг с Clean code.");
        for (Book item : books) {
            if (item.getName().equals("Clean code")) {
                System.out.println(item.getName() + ", количество страниц: "
                        + item.getNumberOfPages()
                );
            }
        }
    }
}
