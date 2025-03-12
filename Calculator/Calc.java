public class Calc{
    public void add(int numone,int numtwo){
        int numthree = numone+numtwo;
        System.out.println(numthree);
    }
        public void subtract(int numone, int numtwo){
            int numthree = numone-numtwo;
            System.out.println(numthree);
        }
        public void multiply(int numone,int numtwo){
            int numthree = numone*numtwo;
            System.out.println(numthree);
        }
        public void divide(int numone,int numtwo){
            int numthree =numone/numtwo;
            System.out.println(numthree);
        }
        public static void main(String args[])
{
    Calc obj=new Calc();
    obj.add(10,2);
    obj.subtract(10,2);
    obj.multiply(10,2);
    obj.divide(10,2);

}
        }
        