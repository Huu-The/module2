import javax.sound.midi.Soundbank;
import javax.swing.plaf.synth.SynthMenuBarUI;
import java.sql.SQLOutput;
import java.util.Scanner;

public class timso {
    public static void main(String[] args) {
        int a,b;
        Scanner nhap = new Scanner(System.in);
        System.out.println("Enter a : ");
        a = nhap.nextInt();
        System.out.println("Enter b: ");
        b = nhap.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0)
            System.out.println("NO greatest common factor");
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
            System.out.println("greatest common factor : " + a);
        }
    }
}
