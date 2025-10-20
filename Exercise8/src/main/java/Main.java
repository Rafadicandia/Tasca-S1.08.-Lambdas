public class Main {

    public static void main(String[] args) {

                StringInverter inverter = (str) -> new StringBuilder(str).reverse().toString();


                String original = "ITAcademyJava";


                String result = inverter.reverse(original);


                System.out.println("Original:  " + original);
                System.out.println("Inverted: " + result);


            }
        }




