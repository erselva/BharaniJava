package constructors;

public class PiggyBank {

    String name;
    double money;
    boolean isEmpty;

    public PiggyBank () { //default constructor
        System.out.println("I am in default Constructor");
    }

    public PiggyBank (String name, double money) { //overloaded constructors
        this.name = name;
        this.money = money;
    }

    public PiggyBank (String name) { //overloaded constructors
        this.name = name;
    }

    public boolean isEmpty() {
        if (this.money == 0) {
            this.isEmpty = true;
        }
        return this.isEmpty;
    }

    public void print() {
        System.out.println("name = " + this.name);
        System.out.println("money = " + this.money);
        System.out.println("isEmpty = " + this.isEmpty());
    }

    public static void main(String[] args) {

        PiggyBank piggyBank1 = new PiggyBank();
        piggyBank1.print();

        PiggyBank piggyBank2 = new PiggyBank("Bharani's Piggy bank", 100);
        piggyBank2.print();

        PiggyBank piggyBank3 = new PiggyBank("Selva's Piggy bank");
        piggyBank3.print();
    }
}
