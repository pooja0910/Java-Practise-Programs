import java.util.*;
class automorphic
{
    public static void main(String args[]) throws Exception
    {
       Scanner sc= new Scanner(System.in);
       System.out.println("enter the number to be checked");
       int n= sc.nextInt();
      int sq =n*n;
      // finding square of the number then .
        String num= Integer.toString(n);
        String Square=Integer.toString(sq);
        // here we have done the string conversion from integer so that we can check on the point that number is //
        //alphabatically can be checked out.
        if(Square.endsWith(num)){
            System.out.println("number is automorphic number");

        }
else{
            System.out.println("not automorphic");
        }
    }
}