//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            Solution ob = new Solution();
            System.out.println(ob.javaIntType(sc));
            System.out.println(ob.javaStringType(sc));
            System.out.println(ob.javaFloatType(sc));
        
System.out.println("~");
}
    }
}
// } Driver Code Ends


class Solution {

    int javaIntType(Scanner sc) {
        // code here
     int a=sc.nextInt();
     return a;
    }
    
    String javaStringType(Scanner sc) {
        // code here
        String b=sc.next();
        return b;
    }
    
    float javaFloatType(Scanner sc) {
        // code here
       float c=sc.nextFloat();
        return c;
    }
};