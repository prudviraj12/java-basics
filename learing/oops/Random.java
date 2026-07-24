import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random random = new Random();

        int num = random.nextInt(100) + 1;
        int num1 =random.nextInt(1,100);
        System.out.println(num1);

        System.out.println(num);
    }
}