import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int [] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;

        double [] numbers2 = {1.57, 7.654, 9.986};

        int [] numbers3 = {45,67,34};

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int [] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        System.out.print(numbers1[0] + ", ");
        System.out.print(numbers1[1] + ", ");
        System.out.println(numbers1[2]);

        double [] numbers2 = {1.57, 7.654, 9.986};
        System.out.print(numbers2[0] + ", ");
        System.out.print(numbers2[1] + ", ");
        System.out.println(numbers2[2]);

        int [] numbers3 = {45,67,34};
        System.out.print(numbers3[0] + ", ");
        System.out.print(numbers3[1] + ", ");
        System.out.println(numbers3[2]);

    }
    public static void task3 () {
        System.out.println("Задача 3");
        int [] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = 2; i >= 0 ; i--){
            if (i == 0) {
                System.out.println(numbers1[i]);
            } else System.out.print(numbers1[i] + ", ");
        }

        double [] numbers2 = {1.57, 7.654, 9.986};
        for (int i = 2; i >= 0 ; i--){
            if (i == 0) {
                System.out.println(numbers2[i]);
            } else System.out.print(numbers2[i] + ", ");
        }

        int [] numbers3 = {45,67,34};
        for (int i = 2; i >= 0 ; i--){
            if (i == 0) {
                System.out.println(numbers3[i]);
            } else System.out.print(numbers3[i] + ", ");
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        int [] numbers1 = new int[3];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = 0; i<=2; i++){
            if (numbers1[i] % 2 == 0){
                continue;
            } else numbers1[i] = numbers1[i] + 1;
        }
        System.out.println(Arrays.toString(numbers1));
    }
}