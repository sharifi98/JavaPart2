package Part11.Exeptions;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exepctions {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);



        // readNumbers(scanner);
        ArrayList<String> lines = new ArrayList<>();

        readLines("dab");

        // create a Scanner object for reading files
        try {
            // read all lines from a file
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());

        }

        // do something with the lines






    }




    public static int readNumbers(Scanner reader) {
        while (true) {
            System.out.println("Give a number: ");

            try {
                int readNumber = Integer.parseInt(reader.nextLine());
                return readNumber;
            } catch (Exception e) {
                System.out.println("User input was not a number.");
            }


        }
    }

    public static List<String> readLines(String fileName){
        List<String> lines =  new ArrayList<>();

        try {
            Files.lines(Paths.get("file.txt")).forEach(line -> lines.add(line));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return lines;
    }

    public static List<String> rLines(String fileName) throws Exception {
        ArrayList<String> lines = new ArrayList<>();
        Files.lines(Paths.get(fileName)).forEach(line -> lines.add(line));
        return lines;
    }







}

