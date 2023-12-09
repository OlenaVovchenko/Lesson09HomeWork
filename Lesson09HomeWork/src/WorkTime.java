import java.util.Random;

public class WorkTime {
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(28801);

        int timeInHours = n / 3600;

        String messege;
        if (timeInHours >= 2){
            messege = "осталось " + timeInHours + " часа";
        } else if (timeInHours == 1) {
            messege = "остался 1 час";
        }
        else {
            messege = "осталось менее часа";
        }
        System.out.println(n + " секунд");
        System.out.println(messege);
    }
}
