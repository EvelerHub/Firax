package ua.nure.manko.Practice1;

/**
 * Created by Eveler on 06.05.2015.
 */
public class Demo {

    public static void main(String[] args) {
        Part1.main(new String[]{});
        Part2.main(new String[]{"1", "3"});
        Part3.main(new String[]{"34", "8"});
        Part4.main(new String[]{"123123"});
        System.out.println(Part5.chars2digits("Z"));
        System.out.println(Part5.digits2chars(26));
        System.out.println(Part5.rightColumn("Z"));
    }

}
