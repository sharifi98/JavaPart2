package part10.Part10OtherUsefulTechniques;

import java.util.Scanner;

public class RegularExpressions {
    public static void main(String[] args) {

        Card first = new Card(10,Suit.HEART);
        System.out.println(first);

        if (first.getSuit() == Suit.SPADE) {
            System.out.println("is a spade");
        } else {
            System.out.println("is not a spade");
        }
        
        System.out.println("Provide a student number: ");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();

        if (number.matches("01[0,9]{7}"))
            System.out.println("Correct format");
        else
            System.out.println("Incorrect format");

        String string = "00";
        if (string.matches("00|111|0000")) {
            System.out.println("The String contained one of the three alternatives");
        } else {
            System.out.println("The string contained none of the alternatives");
        }



        String word = "Trolololololo";
        if (word.matches("trolo(lo)*")) {
            System.out.println("Correct form");
        } else {
            System.out.println("Incorrect form.");
        }


        if (word.matches("trolo(lo)+"))
            System.out.println("Correct form");
        else
            System.out.println("Incorrect form");

        String bat = "nananananana batman";
        if (word.matches("(na) + batman"))
            System.out.println("Correct form");
        else
            System.out.println("Incorrect form");


        String meme = "You have to accidentally the whole meme";
        if (meme.matches("You have to accidentally (delete)?the whole meme")) {
            System.out.println("Correct form");
        } else {
            System.out.println("Incorrect form");
        }


    }
}
