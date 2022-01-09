import java.io.*;

public class Task_6 {
    public static int min_distance(String name_f) {
        int distance, min = 1000000;
        try(BufferedReader DistRead = new BufferedReader(new FileReader("C:\\Programming\\" + name_f))){
            String distance_temp;
            while ((distance_temp = DistRead.readLine())!= null){
                distance = Integer.parseInt(distance_temp);
                if(min > distance){
                    min = distance;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return min;
    }
}
