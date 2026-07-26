import java.util.Random;
public class random {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(100) + 1;
        int num1 =random.nextInt(1,100);
        int nums2 =random.nextInt(2,3);
        System.out.println(nums2);
        System.out.println(num1);
        System.out.println(num);
    }
}
