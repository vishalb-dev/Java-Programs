import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array2
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int arr[]=new int[5];
        int i,search;
        int flag=0;

        for(i=0;i<=4;i++)
        {
            System.out.print("Enter any number : ");
            arr[i]=Integer.parseInt(br.readLine());
        }

        System.out.println();
        System.out.println("ARRAY");
        for(i=0;i<=4;i++)
        {
            System.out.print(""+arr[i]);
            System.out.print(" ");
        }

        System.out.print("\n\n");
        System.out.print("Enter number to search : ");
        search=Integer.parseInt(br.readLine());

        for(i=0;i<=4;i++)
        {
            if(search==arr[i])
            {
                flag=1;
                System.out.println();
                System.out.println("Number found successfully!!");
                System.out.println(""+search+" is at index no."+i);
                break;
            }
        }

        if(flag==0)
        {
            System.out.println("Number not found!!");
        }
        
    }    
}






