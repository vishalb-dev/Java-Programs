import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class sum
{
    public static void main(String[] args) throws IOException
    {
        int a,b,s;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number : ");
        a=Integer.parseInt(br.readLine());
        System.out.print("Enter second number : ");
        b=Integer.parseInt(br.readLine());
        s=a+b;
        System.out.print("Sum : "+s);
    }   
}




