package part10.TheComparableInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainMember {

    public static void main(String[] args) {
        List<Member> member = new ArrayList<>();
        member.add(new Member("Mikael",182));
        member.add(new Member("mattyi",187));
        member.add(new Member("ada", 184));

        member.stream().forEach(m -> System.out.println(m));
        System.out.println();

        //sorting the stream that si to be printed using the sorted method

        member.stream().sorted().forEach(m -> System.out.println(m));
        member.stream().forEach(m -> System.out.println(m));

        // sorting a list with the sort method of the collections class
        Collections.sort(member);
        member.stream().forEach(m -> System.out.println(m));


    }
}
