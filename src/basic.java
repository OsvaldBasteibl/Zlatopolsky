import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Выбор задания:");
            System.out.println("Задание № 1");
            System.out.println("Задание № 2");
            System.out.println("Для выхода нажмите 9");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Введите величину сопротивления: ");
                    int resistance = input.nextInt();
                    resistance = Task_1.resistor(resistance);
                    System.out.println("Общее сопротивление равно: " + resistance);
                case 2:
                    System.out.println("Введите стоимость товара: ");
                    int cost = input.nextInt();
                    System.out.println("Общая стоимость товаров дороже 1000р равна: " +cost);
            }
        }while (choice != 9);


    }
}
