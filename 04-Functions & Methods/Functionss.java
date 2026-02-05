/*

Function syntax

returnType FUnctionName(Type arg1, arg2, ......) {
    // operations
}

definations = function is a block of code which take some inputs and perform
              some operations on inputs and after operations give us output.

              public static void main(String[] args) {
              
              } this is also function where void used for no returns

*/ 

import java.util.*;

public class Functionss {

    public static void PrintMyName(String name) {
        System.out.println(name);
        return ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();

        PrintMyName(name);

    }
}