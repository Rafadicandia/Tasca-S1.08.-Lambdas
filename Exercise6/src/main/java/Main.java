import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Object> variatedList = new ArrayList<>();

        variatedList.add("Hello");
        variatedList.add(9485685);
        variatedList.add(94595);
        variatedList.add("HelloWorld");

        
        variatedList.sort((s1, s2) -> Integer.compare(s2.toString().length(), s1.toString().length()));


    }

}
