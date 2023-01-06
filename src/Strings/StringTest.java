package Strings;

public class StringTest {

    public static void main(String[] args) {

        String name1 = "Bharani";
        String name2 = "amma";
        String name3 = "bharani";

        System.out.println("Char at 4=" + name1.charAt(4));
        System.out.println("length=" + name1.length());
        System.out.println(name1.concat(" Amma"));
        if (name1.endsWith("i")) {
            System.out.println("true");
        }
        if (name1.equals(name2)) {
            System.out.println("true");
        } else {
            System.out.println("true");
        }

        System.out.println(name1.equalsIgnoreCase(name3));

        System.out.println(name1.lastIndexOf("a"));

        System.out.println(name1.replace("a","z"));

        System.out.println(name1.trim());
        System.out.println(name1.substring(3,6));

        StringBuffer sb = new StringBuffer("Bharani");
        System.out.println(sb.append(" appa"));
        System.out.println(sb.insert(2,"zzzz"));
        System.out.println(sb.delete(2,4));
        System.out.println(sb.reverse());

        String name = "appa";
        String reversed = (new StringBuffer(name).reverse()).toString();
        System.out.println("is palindrom? " + name.equals(reversed));
    }
}
