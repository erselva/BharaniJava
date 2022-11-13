package wrapperclasses;

public class WrapperTest1 {

    public static void main(String[] args) {

        Integer integer = Integer.valueOf("10");
        System.out.println("Obj value = " + integer.toString());

        int value = integer.intValue();
        System.out.println(" int value = " + value);

        int value1 = Integer.parseInt("12");
        System.out.println(" int value1 = " + value1);

        Integer int1 = 15; //Autoboxing
        System.out.println(" int value1 = " + int1);

        int value2 = int1; //unboxing

        Boolean booObj1 = Boolean.valueOf("true");
        System.out.println("booObj1 = " + booObj1);

        boolean boo2 = booObj1.booleanValue();
        System.out.println("boo2 = " + boo2);

        Boolean booObj2 = Boolean.valueOf(boo2);
        System.out.println("booObj2 = " + booObj2);
    }
}
