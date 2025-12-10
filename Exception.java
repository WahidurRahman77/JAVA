public class Exception {
    public static void main(String[] args) {
        try {
            int x = 10;
            int y = 0;
            int result = x/y;
            System.out.println("result "+result);
        } catch (ArithmeticException e1) {
            System.out.println("Exception handled" +e1);
        }
        catch (ArrayIndexOutOfBoundsException e2) {
            System.out.println("Exception handled" +e2);
        }
        finally{
            System.out.println("The Last Line");
        }
    }
}

