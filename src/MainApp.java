import java.util.Locale;

public class MainApp {
    public static void main(String[] args) {

        String[] names = new String[5];

        // wartości tablicy ["Bartek", "Marcin", "Joanna", "Tomek", "Michał"]
        // indeks tablicy   [  0    ,       1  ,   2     ,  3     ,   4     ]

        names[0] = "Bartek";
        names[1] = "Marcin";
        names[2] = "Joanna";
        names[3] = "Tomek";
        names[4] = "Michał";

//        for (licznik; warunek; zmiana licznika)

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

//        for (int i = 0; i < names.length; i++) {
//            if (i % 2 != 0) {
//                System.out.println(names[i]);
//            }
//        }
//
//        for (String name : names) {
//            System.out.println(name);
//        }

//        int[] numbers = new int[10];
//        System.out.println("Długość tablicy: " + numbers.length);

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers.length);
//        System.out.println(numbers[4]);

//        String[] names = {"Jola", "Mateusz", "Bonifacy"};
//        System.out.println(names.length);
//
//        for (String name : names) {
//            System.out.println(name.toLowerCase());
//
//        }
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i].toUpperCase());
//        }

//        int number = 10;
//        number = number + 1;
//        System.out.println(number);

//        number += 1;
//        System.out.println(number);
//
//        System.out.println(number++); // post increment - zwiększanie wartości po użyciu zmiennej
//        System.out.println(number);
//
//        System.out.println(++number); // pre increment


    }

}
