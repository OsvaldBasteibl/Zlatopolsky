
import java.util.Scanner;

public class Task_2 {
    public static int cost_product(int cost){
        int sum = cost;
        Scanner input = new Scanner(System.in);
        while (input.hasNextInt()){
            cost = input.nextInt();
            sum = sum + cost;
        }
        return sum;
    }
}
