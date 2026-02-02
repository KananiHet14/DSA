import java.util.*;

public class ExtraQuestions {

    public static void main(String[] args) {

        // 1 = print the sum of first n natural number where n is taken form user

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i=0; i<=n; i++) {
            sum = sum + i;
        }
            System.out.println(sum);
    }
}