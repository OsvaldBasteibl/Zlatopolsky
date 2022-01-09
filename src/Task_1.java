import java.util.Scanner;

public class Task_1 {
    public static int resistor(int current_resistance){
        int sum = current_resistance;
        Scanner input = new Scanner(System.in);
        for(int i = 1; i < 6; i++){
            current_resistance = input.nextInt();
            sum = sum + current_resistance;
        }
        return sum;
    }
}
