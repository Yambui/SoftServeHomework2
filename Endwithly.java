import java.util.Scanner;

public class Endwithly {
    static boolean Endwithlyr(String s)
    {
        return s.endsWith("ly");
    }

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("imput string");
        String str = new String (S.nextLine());
        System.out.println("Ends with \"ly\": " + Endwithlyr(str));
    }
}
