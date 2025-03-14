public class Over
{
    void add(int a,int b)
    {
        System.out.println("answer is"+(a+b));
    }
    void add (int a,int b,int c)
    {
        System.out.println("answer is"+(a+b+c));
    }
    public static void main(String args[]){
Over obj=new Over();
obj.add(10,20);
obj.add(10,20,30);
    }
}