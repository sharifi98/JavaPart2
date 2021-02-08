package part10.Part10CollectionsAndStreams;

import java.util.ArrayList;
import java.util.List;

public class TerminalOperations {
    public static void main(String[] args) {
        // Lets assume that we have a list of books;
        List<Book> books = new ArrayList<>();

        double average = books.stream()
                .map(book -> book.getAuthor())
                .mapToInt(author -> author.getBirthYear())
                .average()
                .getAsDouble();

        System.out.println("Average of the authors birth yeares: " + average);


        // the mapping of a book to an author could also be done with a single map call
        // double average = books.stream()
        //          .mapToInt(book -> book.getAuthor().getBirthYear


        // Prints all the authors with the word "Potter" in theirs titels
        books.stream()
                .filter(book -> book.getName().contains("Potter"))
                .map(book -> book.getAuthor())
                .forEach(author -> System.out.println(author));


        books.stream()
                .map(book -> book.getAuthor().getFirstName() + ": " + book.getName())
                .sorted()
                .forEach(name -> System.out.println(name));
    }
}
