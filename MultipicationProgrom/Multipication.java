import java.io.IOException;
public class Multipication  {
    public static void main(String[] args) throws IOException {
        int n = 2;

        int result;
        for(int i=1; i<=10; i++)
        {
            result = n*i;
            System.out.println(n + " x " + i + " = " + result);
        }
    }
}
