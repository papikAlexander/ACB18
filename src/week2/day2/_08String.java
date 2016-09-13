package week2.day2;

/**
 * Created by Alexander on 11.09.2016.
 */
public class _08String {
    public static void main(String[] args) {
        String name = "Jenja";

        char[] symb = {'J', 'e', 'n', 'j', 'a'};
        String name2 = new String(symb);

        String name3 = new String("Jenja");

        System.out.println(name.equals(name3));

        System.out.println(name.charAt(4));

        System.out.println(name.length());

        System.out.println(name.contains("Jen"));

        System.out.println(name.equalsIgnoreCase("jenja"));

        System.out.println(name.toLowerCase());

        System.out.println(name.toUpperCase());
        System.out.println("Egg".compareTo("Apple"));
    }
}
