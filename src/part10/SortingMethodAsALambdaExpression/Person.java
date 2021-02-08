package part10.SortingMethodAsALambdaExpression;

public class Person {

    private int birthYear;
    private String name;


    public Person(String name, int birthYear) {
        this.birthYear = birthYear;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

}
