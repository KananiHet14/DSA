import java.util.*;

public class RecursionTopic {
    
    // print 5 to 1
    // public static void PrintNumbers(int n) {
    //     if(n==0) {
    //         return;
    //     }
    //     System.out.println(n);
    //     PrintNumbers(n-1);
    // }
    // public static void main(String[] args) {
    //     int n=5;
    //     PrintNumbers(n);
    // }


    // print 1 to 5
    // public static void PrintNumbers(int n) {
    //     if(n==6) {
    //         return;
    //     }
    //     System.out.println(n);
    //     PrintNumbers(n+1);
    // }
    // public static void main(String[] args) {
    //     int n=1;
    //     PrintNumbers(n);
    // }

//    print sum of first n natural numbers
    public static void PrintSum(int i,int n, int sum) {
       if(i==n) {
        sum += i;
        System.out.println(sum);
        return;
       }

       sum += i;
       PrintSum(i+1,n,sum);
       
    }
    public static void main(String[] args) {
    PrintSum(1, 5, 0);
}
}