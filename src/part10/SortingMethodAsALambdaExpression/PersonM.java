package part10.SortingMethodAsALambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonM {
    public static void main(String[] args) {

        List<Film> films = new ArrayList<>();
        films.add(new Film("A",2000));
        films.add(new Film("B",1999));
        films.add(new Film("C",2001));
        films.add(new Film("D",2000));

        for (Film e : films) {
            System.out.println(e);
        }

        System.out.println();
        Comparator<Film> comparator = Comparator
                .comparing(Film::getRelaseYear)
                .thenComparing(Film::getName);


        Collections.sort(films, comparator);

        for (Film e : films){
            System.out.println(e);
        }

    }
}
