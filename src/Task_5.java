import java.util.Scanner;

public class Task_5 {
    public static int height_avg(double a){
        Scanner input = new Scanner(System.in);
        double avg_boys = 0, avg_girls = 0,count_girls = 0, count_boys = 0, current_height = a;
        while (current_height != 0.0){
            if(current_height > 0){
                avg_girls = avg_girls + current_height;
                count_girls++;
            }
            if(current_height < 0){
                avg_boys = avg_boys + current_height;
                count_boys++;
            }
            current_height = input.nextDouble();
        }
        System.out.println("Средний рост девочек равен: " + avg_girls / count_girls);
        System.out.println("Средний рост мальчиков равен: " + (-1 * avg_boys / count_boys));
        return 1;
    }
}
