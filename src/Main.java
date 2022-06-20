import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Simyacı", 188, "Paulo Coelho", 1988);
        Book b2 = new Book("Olasılıksız", 472, "Adam Faver", 2005);
        Book b3 = new Book("Empati", 690, "Adam Faver", 2007);
        Book b4 = new Book("Vadideki Zambak", 336, "Honoré de Balzac", 1835);
        Book b5 = new Book("Sefiller", 400, "Vıctor Hugo", 1862);
        Book b6 = new Book("Suç ve Ceza", 705, "Fyodor Dostoyevski", 1866);
        Book b7 = new Book("1984", 352, "George Orwell", 1949);
        Book b8 = new Book("Hayvan Çiftligi", 152, "George Orwell", 1945);
        Book b9 = new Book("Yüzüklerin Efendisi", 1346, "J. R. R. Tolkien", 1954);
        Book b10 = new Book("Silmarillion", 689, "J. R. R. Tolkien", 1977);
        ArrayList<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        books.add(b5);
        books.add(b6);
        books.add(b7);
        books.add(b8);
        books.add(b9);
        books.add(b10);

        HashMap<String, String> authorAndBook = new HashMap<>();
        books.forEach(i -> authorAndBook.put(i.getBookName(), i.getAuthor()));
        authorAndBook.keySet().forEach(name -> System.out.println(name + " " + authorAndBook.get(name)));


        System.out.println("-----------------------------------------");

        ArrayList<Book> bookFilter = new ArrayList<>();
        books.stream().filter(book -> book.getPageNumber()>100).forEach(bookFilter::add);
        bookFilter.forEach(book -> System.out.println(book.getBookName()));




    }
}
