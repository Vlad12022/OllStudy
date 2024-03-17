package HomeWork;

import java.util.Scanner;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Vector;


public class BookEx1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(123, NameBooks.HARRY_POTTER, "Джоан Роулинг", Publishing.BLOOMSBURY, LocalDate.of(1997, 2, 23), 500, Book.Price_4, Binding.SOFT));
        books.add(new Book(460, NameBooks.SHERLOCK_H0LMES, "Артур Конан", Publishing.AST, LocalDate.of(1892, 10, 16), 500, Book.Price_3, Binding.SOLID));
        books.add(new Book(245, NameBooks.WITCHER, "Анджей Сапковский", Publishing.AST, LocalDate.of(1986, 2, 12), 500, Book.Price_5, Binding.SOLID));
        books.add(new Book(257, NameBooks.IT, "Стивен Кинг", Publishing.AST, LocalDate.of(1986, 7, 29), 500, Book.Price_2, Binding.SOFT));
        books.add(new Book(378, NameBooks.GREEN_MILE, "Стивен Кинг", Publishing.BLOOMSBURY, LocalDate.of(1932, 4, 18), 500, Book.Price_1, Binding.SOFT));

        System.out.println("Введите имя автора:");
        String name = scan.nextLine();

        StringBuilder doIt = new StringBuilder();
        doIt.append(name).append(",").append("Написал -");

        for (Book book : books) {
            if (book.getAuthor().equals(name)) {
                doIt.append(book.getNameBooks()).append(",");

            }
        }
        System.out.println(doIt.substring(0,doIt.length()-1));


        System.out.println();


        System.out.println("Введите название книги:");
        String nameBook = scan.nextLine();

        StringBuilder res = new StringBuilder();
        res.append(nameBook).append(",").append("Написал - ");

        for (Book book : books) {
            if (book.getNameBooks().toString().equals(nameBook)) {
                res.append(book.getAuthor()).append(",");

            }
        }
        System.out.println(res.substring(0, res.length() - 1));


        System.out.println();


        System.out.println("Введите дату:");
        LocalDate date = LocalDate.parse(scan.nextLine());

        StringBuilder res2 = new StringBuilder();
        res2.append("Книги написанные после этой даты - ").append(date).append(",");

        for (Book book : books) {
            if (book.getRelease().isAfter(date)) {
                res2.append(book.getNameBooks()).append(",");
            }
        }
        System.out.println(res2.substring(0, res2.length() - 1));


    }
}