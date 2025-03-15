import java.util.*;
public class Salary{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary =input.nextInt();
        System.out.println("Enter the choice");
        int i=input.nextInt();
        if(1==1){
            double percent =salary*0.1;
           double sal = salary+percent;
            System.out.println("Salary of the manager:"+sal);
                    }
                    else if(i==2){
                        double percent=salary*0.2;
                       double sal =salary+percent;
                        System.out.println("Salary of the developer:"+sal);
                    }
                    else{
                        System.out.println(salary);
                    }
    }
}