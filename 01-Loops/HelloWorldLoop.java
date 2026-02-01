import java.util.*;

public class HelloWorldLoop {
    public static void main(String[] args) {
        // print hello world n time (n taken from user)

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        for(int i=0; i<num; i++) {
            System.out.println("Hello World");
        }
    }
}