import java.util.Scanner;

public class Task_1 {
    public static int resistor(int in){
        int sum;
        sum = in;
        for(int i = 1; i < 6; i++){
            Scanner input = new Scanner(System.in);
            in = input.nextInt();
            sum = sum +in;
        }
        return sum;
    }
}
