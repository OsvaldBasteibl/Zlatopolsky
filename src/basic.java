import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        System.out.println("Введите величину сопротивления: ");
        Scanner input = new Scanner(System.in);
        int resis = input.nextInt();
        resis = Task_1.resistor(resis);
        System.out.println(resis);
    }
}
