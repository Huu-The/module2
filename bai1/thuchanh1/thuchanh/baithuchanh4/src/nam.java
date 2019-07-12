import java.util.Scanner;

public class nam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a :");
        double a = sc.nextDouble();
        System.out.println("b :");
        double b = sc.nextDouble();
        System.out.print("c :");
        double c = sc.nextDouble();
        if (a !=0){
            double answer = (c-b)/2;
            System.out.printf("Equation pass with x = %f!\n", answer);
        } else {
           if (b == 0) {
               System.out.print("The solution is all x!");
           } else  {
               System.out.print("No solution!");
           }
           }
        }

    }


