
import java.util.Scanner;

public class Task_2 {
    public static int cost_product(int cost){
        int sum = cost;
        Scanner input = new Scanner(System.in);
        while (cost != 0){
            cost = input.nextInt();
            sum = sum + cost;
        }
        return sum;
    }
}
