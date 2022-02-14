//public class AllTest {
//
//    public static void main(String[] args) {

//        1. ZADANIE
//        int[] numbers = {1, 2, 3, 4, 5};
//
//        a. Pierwsza metoda
//        int first = numbers[0];
//        int last = numbers[numbers.length - 1];
//
//        numbers[0] = last;
//        numbers[numbers.length - 1] = first;
//
//        for (int number : numbers
//        ) {
//            System.out.println(number);
//        }
//
//        b. Druga metoda
//        int first = numbers[0];
//        numbers[0] = numbers[numbers.length - 1];
//        numbers[numbers.length - 1] = first;
//
//        for (int number : numbers
//        ) {
//            System.out.println(number);
//        }
//
//        c.Trzecia metoda
//        numbers[numbers.length - 1] = numbers[numbers.length - 1] + numbers[0];
//        numbers[0] = numbers[numbers.length - 1] - numbers[0];
//        numbers[numbers.length - 1] = numbers[numbers.length - 1] - numbers[0];
//
//        for (int number : numbers
//        ) {
//            System.out.println(number);
//        }

//        2. ZADANIE
//        int[] numbers = {2, 2, 3, 4, 5, 7, 7, 8, 8, 2};
//
//        int even = 0;
//        int odd = 0;
//
//        for (int number : numbers) {
//            if (number % 2 == 0) {
//                even += 1;
//            } else {
//                odd += 1;
//            }
//        }
//
//        System.out.println("Liczby parzyste: " + even);
//        System.out.println("Liczby nieparzyste: " + odd);
//
//        3. ZADANIE
//        int[] numbers = {2, 4, 1, 9, 5, 2, 4, 0, 5, 8};
//        int min;
//
//        for (int i = 0; i < numbers.length; i++) {
//            min = numbers[i];
//            for (int j = i + 1; j < numbers.length; j++) {
//                if (numbers[j] < min){
//                    min = numbers[j];
//                    numbers[j] = numbers[i];
//                    numbers[i] = min;
//                }
//            }
//        }
//        for (int number:numbers
//             ) {
//            System.out.println(number);
//        }
//    }
//}
