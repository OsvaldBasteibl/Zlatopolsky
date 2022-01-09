import java.util.Scanner;

public class Task_3 {
    public static int rainfall(int a){
        int rainfallInMonth = a, sum = 0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 11; i++ ){
            if(i % 2 != 0){
                sum = sum + rainfallInMonth;
            }
            rainfallInMonth = input.nextInt();
        }
        return sum;
    }
}
