import java.util.Scanner;

public class Stringlengthord {
    String [] S;

    Stringlengthord (int n) {
    S = new String [n];
    }
    public void Setelement (int i, String s){
        this.S[i]=s;
    }
    public void Printarr(){
        for (int i = 0; i < this.S.length;i++){
            System.out.println("Element of array #"+(i+1)+": "+this.S[i]);
        }
    }
    private void Sortdesc(){
        String buf = new String();
        for (int i=0; i<this.S.length; i++ ) {
            for (int j=0; j<this.S.length-1; j++) {
                if (S[j].length() < S[j + 1].length()) {
                    buf = S[j];
                    S[j]=S[j+1];
                    S[j+1]=buf;
                }
            }
        }
    }
    private void Sortasc(){
        String buf = new String();
        for (int i=0; i<this.S.length; i++ ) {
            for (int j=0; j<this.S.length-1; j++) {
                if (S[j].length() > S[j + 1].length()) {
                    buf = S[j];
                    S[j]=S[j+1];
                    S[j+1]=buf;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = 0;
        char ch;
        System.out.println("Pls imput string array length");
        while (true) {
            if (s.hasNextInt()) {
                n = s.nextInt();
                s.nextLine();
                break;
            } else {
                System.out.println("imput incorrect must be int");
                s.nextLine();
            }
        }
        Stringlengthord STR = new Stringlengthord(n);
        for(int i = 0; i<n; i++){
            System.out.println("Pls imput "+ (i+1) +" string element");
            STR.Setelement(i,s.nextLine());
        }
        System.out.println("Should we sort in ascending or descending order?(enter \"a\"or \"d\")");
        while(true) {
            System.out.println("Plz imput \"a\"or \"d\"");
            ch = s.nextLine().charAt(0);
            if ((ch=='a')|(ch=='d')) break;
        }
        if (ch=='a') STR.Sortasc(); else STR.Sortdesc();
        STR.Printarr();
    }
}
