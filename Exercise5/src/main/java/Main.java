public class Main {

    public static void main(String[] args) {

        PiCalculator pi = () -> 3.1415;

        double piValue = pi.getPiValue();


        System.out.println("The value of pi is: " + piValue);


    }
}
