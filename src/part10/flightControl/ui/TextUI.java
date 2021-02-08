package part10.flightControl.ui;

import part10.flightControl.domain.Flight;
import part10.flightControl.domain.Airplane;
import java.util.Scanner;

import part10.flightControl.logic.FlightControl;

public class TextUI {
    private FlightControl flightControl;
    private Scanner scanner;

    public TextUI(FlightControl flightControl, Scanner scanner) {
        this.flightControl = flightControl;
        this.scanner = scanner;
    }

    public void start() {

    }



    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("---------------------");
        System.out.println();


        while (true) {
            System.out.println("Choose and action");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[1] Exit Airport Asset Control");

            System.out.println(">");
            String answer = scanner.nextLine();

            if (answer.equals("1")) {

            }
        }
    }

    private void addAirPlane() {
        System.out.println("Give the airplane id:");
        String id = scanner.nextLine();
        System.out.println("Give me airplane capacity");
        int capacity = Integer.parseInt(scanner.nextLine());

        this.flightControl.addAirplane(id,capacity);
    }


    private void addFlight() {
        System.out.println("Give the airplane ID");
        Airplane airplane = askForAirplane(scanner);
        System.out.println("Give the departure airport id: ");
        String depatureID = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String destinationID = scanner.nextLine();;

        this.flightControl.addFlights(airplane,depatureID,destinationID);
    }

    private void startFlightControl() {
        System.out.println("Flight control");
        System.out.println("--------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action");
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            String answer = scanner.nextLine();

            System.out.println(">");
            if (answer.equals("1")) {
                printAirplanes();
            } else if (answer.equals("2")) {
                printflights();
            } else if (answer.equals("3")) {
                printAirplaneDetails();
            } else if (answer.equals("x")) {
                break;
            }
        }
    }

    private void printAirplanes() {
        for (Airplane plane : flightControl.getAirPlanes()) {
            System.out.println(plane);
        }
    }


    private void printflights() {
        for (Flight flight : flightControl.getFlights()) {
            System.out.println(flight);
            System.out.println("");
        }
    }

    private void printAirplaneDetails() {
        System.out.println("Give airplane id: ");
        Airplane plane = askForAirplane(scanner);
        System.out.println(plane);
        System.out.println();
    }





    private Airplane askForAirplane(Scanner scanner) {
        Airplane airplane = null;
        while (airplane == null) {
            String id = this.scanner.nextLine();
            airplane = flightControl.getAirplane(id);


            if (airplane == null) {
                System.out.println("No airplane with this id " + id + ".");
            }
        }
        return airplane;
    }

}
