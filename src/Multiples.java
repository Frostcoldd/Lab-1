public class Multiples {
    static void main() {
        int k = 0;
        for (int i = 0; i < 100; i++){
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            k++;

        } else if (divisibleBy3) {

            k++;

        } else if (divisibleBy5) {

            k++;

        }



        }

        System.out.println(k);
    }
}
