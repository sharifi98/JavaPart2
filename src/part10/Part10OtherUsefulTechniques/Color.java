package part10.Part10OtherUsefulTechniques;

public enum Color {

    // constructor parameters are defines as constructor
    // the constants are enumerated
    RED("FF0000"),
    GREEN("#00FF00"),
    BLUE("#0000FF");

    private String code; // object reference variable


    private Color(String code) {
        this.code = code;
    }

    public String toString() {
        return this.code;
    }

}
