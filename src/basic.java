import java.io.*;
import java.util.Scanner;

public class basic {
    public static void main(String[] args)  {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Выбор задания:");
            System.out.println("Задание № 1");
            System.out.println("Задание № 2");
            System.out.println("Задание № 3");
            System.out.println("Задание № 4");
            System.out.println("Задание № 5");
            System.out.println("Задание № 6");
            System.out.println("Для выхода нажмите 9");
            choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Введите величину сопротивления: ");
                    int resistance = input.nextInt();
                    resistance = Task_1.resistor(resistance);
                    System.out.println("Общее сопротивление равно: " + resistance);
                }
                case 2 -> {
                    System.out.println("Введите стоимость товара: ");
                    int cost = input.nextInt();
                    cost = Task_2.cost_product(cost);
                    System.out.println("Общая стоимость товаров дороже 1000р равна: " + cost);
                }
                case 3 -> {
                    System.out.println("Введите значения осадков в месяц: ");
                    int rainFallInMonth = input.nextInt();
                    rainFallInMonth = Task_3.rainfall(rainFallInMonth);
                    System.out.println("Общее количество осадков в четных месяцах: " + rainFallInMonth);
                }
                case 4-> {
                    System.out.println("Введите оценку ученика: ");
                    int evaluate = input.nextInt();
                    evaluate = Task_4.Evaluate_five(evaluate);
                    System.out.println("Количество пятерок: " + evaluate);
                }
                case 5-> {
                    System.out.println("Введите рост ученика: ");
                    double height = input.nextDouble();
                    Task_5.height_avg(height);
                }
                case 6 -> {
                    System.out.println("Введите имя файла: ");
                    String name;
                    name = input.next();
                    int distance = Task_6.min_distance(name);
                    System.out.println("Минимальное расстояние от Москвы до другого города равно: " + distance);
                }
            }
        }while (choice != 9);


    }
}
