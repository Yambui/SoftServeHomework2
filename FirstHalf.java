
import java.util.Scanner;

public class FirstHalf {
    static String FirstHalfa(String s)
    {
        return s.substring(0,(s.length()/2));
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("imput string");
        String str = new String (S.nextLine());
        System.out.println("First half is: " + FirstHalfa(str));
    }
}
