public class CloseTen {
    public static void main(String[] args) {
        double m = 7.0;
        double n = 30.8;
        clousestTen(m, n);
    }
    public static void clousestTen(double m, double n){
        double diffM, diffN;

        if (10 - m > 0){
        diffM = 10 - m;
        } else  {
            diffM = m - 10;
        }

        if (10 - n > 0){
            diffN = 10 - n;
        } else {
            diffN = n - 10;
        }

        if (diffM < diffN) {
            System.out.println("Число " + m + " ближе к 10");
        } else if (diffN < diffM) {
            System.out.println("Число " + n + " ближе к 10");
        } else {
            System.out.println("Оба числа " + m + " и " + n + " находятся на одинаковом расстоянии от 10");
        }
    }

}
