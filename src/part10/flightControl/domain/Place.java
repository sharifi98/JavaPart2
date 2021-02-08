package part10.flightControl.domain;

public class Place {
    private String ID;

    public Place(String ID) {
        this.ID = ID;
    }

    public String getID() {
        return this.ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }


    public String toString() {
        return this.ID;
    }
}


