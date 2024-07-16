import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class array3
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int size=0,i=0,ch;
        int flag=0;
        int arr[]=new int[20];
        do
        {
            System.out.print("Enter any number : ");
            int number=Integer.parseInt(br.readLine());
            arr[i]=number;
            i++;
            size++;
            System.err.print("Do you wanna add more(1/0) : ");
            ch=Integer.parseInt(br.readLine());
        }while(ch!=0);

        System.err.println();
        System.err.println("ARRAY");
        for(i=0;i<size;i++)
        {
            System.err.print(arr[i]);
            System.err.print(" ");
        }  

        System.err.println();
        System.err.print("Enter number you wanna search : ");
        int search=Integer.parseInt(br.readLine());

        for(i=0;i<size;i++)
        {
            if(search==arr[i])
            {
                flag=1;
                System.err.println("Number "+search+" found at index no. " +i);
                break;
            }    
        }
        if(flag==0)
        {
            System.err.println("Number not found!!");
        }
    }    
}
