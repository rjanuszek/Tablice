public class Test3 {


    public static void main(String[] args) {

        int[] numbers = {9, 8, 7, 6, 5, 4, 1, 2, 3};

        int min;

        for (int i = 0; i < numbers.length; i++) {
            min = numbers[i];
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[j] < min) {
                    min = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = min;
                }
            }
        }

        for (int number : numbers
        ) {
            System.out.println(number);

        }

    }
}
