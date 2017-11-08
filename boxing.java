import java.io.*;
class boxing{
    public static void main(String[]args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter the number of boxes");
        int n=Integer.parseInt(br.readLine());
        int cart=0;
        int totalcart=0;


    int boxc[] = {48, 24, 12, 6};


            for (int i = 0; i < 4; i++) {
        cart = n / boxc[i];
        if (cart != 0) {
            System.out.println(boxc[i] + "\tx" + cart + "\t=" + boxc[i] * cart);
        }

        n = n % boxc[i];

        totalcart = totalcart + cart;

    }
            System.out.println(totalcart);
            if(n>0){
        totalcart= totalcart+1;
        System.out.println("with one more adjustable"+totalcart);
    }
    }
}
