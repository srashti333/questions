import java.util.Scanner;

class college
{
    int a;
    college(int a)
    {
        this.a=a;
        System.out.println(a);
    }
}//example explinAtion
class hostel
{
    int b;
    hostel(int b)
    {
        this.b=b;
        System.out.println(b);
    }
}
class mess
{
    int c;
    mess(int c)
    {
        this.c=c;
        System.out.println(c);
    }
}
public class rishita
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        college obj1=new college(s.nextInt());
        hostel obj2=new hostel(s.nextInt());
        mess obj3=new mess(s.nextInt());
    }

}
