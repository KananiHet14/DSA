// import java.util.*;

// public class ReverseStrings {
//     public static void main(String[] args) {
//         // leet code Question
//         Scanner sc = new Scanner(System.in);
//         StringBuilder SB = new StringBuilder(sc.nextLine());

//         for(int i=0; i<SB.length()/2; i++) {
//             int front = i;
//             int back = SB.length() - 1 -i;

//             char frontchar = SB.charAt(front);
//             char backchar = SB.charAt(back);

//             SB.setCharAt(front, backchar);
//             SB.setCharAt(back, frontchar);

//         }
//         System.out.println(SB);
//     }
// }