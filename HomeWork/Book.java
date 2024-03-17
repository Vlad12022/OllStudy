package HomeWork;

import java.time.LocalDate;
import java.util.Objects;

public class Book {
    private int id;
    private NameBooks nameBooks;
    private String author;
    private Publishing publishing;
    private LocalDate release;
    private int numberPages;
    private int price;
    private Binding binding;
    public static final int Price_1 = 100;
    public static final int Price_2 = 200;
    public static final int Price_3 = 300;
    public static final int Price_4 = 400;
    public static final int Price_5 = 50;

    public Book(int id, NameBooks nameBooks, String author, Publishing publishing, LocalDate release, int numberPages, int price, Binding binding) {
        this.id = id;
        this.nameBooks = nameBooks;
        this.author = author;
        this.publishing = publishing;
        this.release = release;
        this.numberPages = numberPages;
        this.price = price;
        this.binding = binding;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public NameBooks getNameBooks() {
        return nameBooks;
    }

    public void setNameBooks(NameBooks nameBooks) {
        this.nameBooks = nameBooks;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publishing getPublishing() {
        return publishing;
    }

    public void setPublishing(Publishing publishing) {
        this.publishing = publishing;
    }

    public LocalDate getRelease() {
        return release;
    }

    public void setRelease(LocalDate release) {
        this.release = release;
    }

    public int getNumberPages() {
        return numberPages;
    }

    public void setNumberPages(int numberPages) {
        this.numberPages = numberPages;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Binding getBinding() {
        return binding;
    }

    public void setBinding(Binding binding) {
        this.binding = binding;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", nameBooks=" + nameBooks +
                ", author='" + author + '\'' +
                ", publishing=" + publishing +
                ", release=" + release +
                ", numberPages=" + numberPages +
                ", price=" + price +
                ", binding=" + binding +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id && numberPages == book.numberPages && price == book.price && nameBooks == book.nameBooks && Objects.equals(author, book.author) && publishing == book.publishing && Objects.equals(release, book.release) && binding == book.binding;
    }


}
