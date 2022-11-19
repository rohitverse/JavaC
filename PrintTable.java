import java.util.*;
import java.io.*;

class PrintTable
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int r = a + (int)Math.pow(2,0) * b;
            System.out.print(r + " ");
            for(int j=1;j<n;j++)
            { 
				r+=(int)Math.pow(2,j)*b;
                System.out.print(r);
                if(j!=n-1){System.out.print(" ");}
            }
            System.out.print("\n");
        }
        in.close();
    }
}
