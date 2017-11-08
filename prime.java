import java.util.Scanner;
public class prime{
    public static void main(String[] args){
        int num,b,c;
        Scanner o=new Scanner(System.in);
        System.out.println("enter the number");
        num=o.nextInt();
        b=1;
        c=0;
        while(b<=num){
            if(num%b==0){
                c=c+1;
            }
            b++;
        }
        if(c==2) {
            System.out.println("number is prime");
        }
            else{
                System.out.println("not prime");
            }

            }
    }

