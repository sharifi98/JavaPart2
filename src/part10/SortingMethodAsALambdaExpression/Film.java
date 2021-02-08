package part10.SortingMethodAsALambdaExpression;

public class Film {
    private String name;
    private int relaseYear;

    public Film(String name, int releaseyear) {
        this.name = name;
        this.relaseYear = releaseyear;
    }

    public String getName() {
        return name;
    }

    public int getRelaseYear() {
        return this.relaseYear;
    }

    public String toString() {
        return this.name + " (" + this.relaseYear +")";
    }
}
