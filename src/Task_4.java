import java.util.*;
public class Task_4 {
    public static int Evaluate_five (int a){
        Scanner input = new Scanner(System.in);
        int sum = 0, Evaluate_current = a;
        while(Evaluate_current != 0){
            if(Evaluate_current == 5){
                sum++;
            }
            Evaluate_current = input.nextInt();
        }
        return sum;
    }
}
