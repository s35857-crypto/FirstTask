//TODO: add missing classes

//OK I will add 'Adder' and 's36385' will add 'Subtractor'.

public class Main {
    public static void main(String[] args) {
        Adder adder = new Adder();
        IO.println(adder.add(1,2));

        Subtractor subtractor = new Subtractor();
        IO.println(subtractor.subtract(6, 3));
    }
}
