package EasyChallenges;
import java.util.*;
import java.io.*;

class Function {
    String FirstReverse(String str) {



        String invString="";
        for(int i=str.length()-1; i>=0; i--)
        {
            invString=invString + String.valueOf(str.charAt(i));

        }
        // code goes here
    /* Note: In Java the return type of a function and the 
       parameter types being passed are defined, so this return 
       call must match the return type of the function.
       You are free to modify the return type. */

        str=invString;
        return str;

    }

    public static void main (String[] args) {
        // keep this function call here
        Scanner  s = new Scanner(System.in);
        Function c = new Function();
        System.out.print(c.FirstReverse(s.nextLine()));
    }

}

