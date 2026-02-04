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

            02 Hollow rhombus

            int n=5;
            
            for(int i=1; i<=n; i++) {
            // spaces
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }

                // stars
                for(int j=1; j<=5; j++) {
                    if(i==1 || j==1 || i==n || j==n) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                        }
                }
                    System.out.println();
            }



            // 04 number pyramid

            int n=5;
            
            for(int i=1; i<=n; i++) {
            // spaces
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }

                // numbers print rows no , rows no times  
                for(int j=1; j<=i; j++) {
                    System.out.print(i + " ");
                }
                    System.out.println();
            }


            // 05 palindromic pattern

            int n = 5;
            for(int i=1; i<=n; i++) {
                // spaces
                for(int j=1; j<=n-i; j++) {
                    System.out.print(" ");
                }
                    // 1st half numbers
                    for(int j=i; j>=1; j--) {
                     System.out.print(j);
                    }

                    // 2nd half numbers
                    for(int j=2; j<=i; j++) {
                     System.out.print(j);
                    }

                    System.out.println();
            } 
    }

}


*/