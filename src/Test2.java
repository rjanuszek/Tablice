public class Test2 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int even = 0;
        int odd = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                even += 1;
            } else {
                odd += 1;
            }
        }

        System.out.println("Liczby parzyste: " + even);
        System.out.println("Liczby nieparzyste: " + odd);
    }

}
