

import java.util.*;
class p13{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the rows");
        int rows=sc.nextInt();
        for(int i=1;i<=rows;i++){
            for(int j=1;j<i;j++ ){
                System.out.print(" ");
            }

            for(int j=i;j<=rows;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i=rows-1;i>=1;i--){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=rows;j++){
                System.out.print(j);
            }
            System.out.println();
        }


    }
}
