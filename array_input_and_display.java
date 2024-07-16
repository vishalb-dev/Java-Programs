import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class array1
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[5];
        int i;
        for(i=0;i<=4;i++)
        {
            System.out.print("Enter any number : ");
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        System.out.println("ARRAY");
        for(i=0;i<=4;i++)
        {
            System.out.println(" "+arr[i]);
        }
    }   
}
