import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<String>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orang");
        fruits.add("Watermelon");
        fruits.add("Kiwi");

        fruits.forEach((n) -> { if(n.matches(".*[oO].*") && n.length()>5) {System.out.println(n);} });
    }
}