import java. util.*;
public class Oper{
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("1Addition/n2Subtraction/n3Multiplication/n4Division");
        System.out.println("Enter choice");
        int choice=input.nextInt();
        System.out.println("Enter the value of a");
        int a=input.nextInt();
        System.out.println("Enter thevalue of b");
        int b=input.nextInt();

        if(choice==1)
    
    {
        System.out.println(a+b);
    }
    else if(choice==2)
    {
        System.out.println(a-b);
    }
    else if(choice==3)
    {
        System.out.println(a*b);
    }
    else
    {
        System.out.println(a/b);
    }
    }

    }

    