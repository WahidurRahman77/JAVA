import java.util.Scanner;

class add {
    int x = 10, y = 20;
int a=50, b=555;
    void display() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(a);
        System.out.println(b);
    }
}

public class Plus 
{
    public static void main(String[] args) 
    {
       
        add obj = new add();
        int sum=0;
        int i=0;
        while (i<3)
        {

            Scanner scanner = new Scanner(System.in);
            int x = scanner.nextInt();
            sum=sum+x;
            i++;

        
        }
        System.out.print(sum);
        
    }

}