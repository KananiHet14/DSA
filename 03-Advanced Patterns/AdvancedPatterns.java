/*

public class AdvancePatterns {
    public static void main(String[] args) {
        01 = butterfly pattern

        int n = 5
        // upper half
        for(int i=1; i<=n; i++) {
            // first part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
                // spaces
                int spaces = 2*(n-i);
                for(int j=1; j<=spaces; j++) {
                    System.out.print(" ");
                }
                    // second part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }

            // Lower half
        for(int i=n; i>=1; i--) {
            // first part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
                // spaces
                int spaces = 2*(n-i);
                for(int j=1; j<=spaces; j++) {
                    System.out.print(" ");
                }
                    // second part
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
                System.out.println();
        }




            02 solid rhombus

            int n=5;
            
            for(int i=1; i<=n; i++) {
            // spaces
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }

                // stars
                for(int j=1; j<=5; j++) {
                    System.out.print("*");
                }
                    System.out.println();
            }
    }

}


*/