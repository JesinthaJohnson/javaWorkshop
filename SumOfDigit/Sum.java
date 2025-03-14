import java.util.*;
public class Sum{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the n values");
        int num=sc.nextInt();
        int a[]=new int[num];
        int i=0;
        int sum=0;
        while(i<num)
        {
            System.out.println("enter the value");
            a[i]=sc.nextInt();
            i++;
        }
        i=0;
        while(i<num)
        {
            sum=sum+a[i];
            i++;
        }
        System.out.println(sum);
        }
        }
    
