import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height , weight, bmi;
        System.out.print("nhập số cân nặng: ");
        weight = sc.nextDouble();
        System.out.print("nhập chỉ số chiều cao: ");
        height = sc.nextDouble();
        bmi = weight/Math.pow(height,2);
        System.out.printf("%-20s%s","bmi","Interpretation\n");

        if (bmi < 18)
            System.out.printf("%-20.2f%s",bmi, "underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20.2f%s",bmi,"normal");
        else if (bmi < 30.0)
            System.out.printf("%-20.2f%s",bmi,"Overweight");
        else
            System.out.printf("%-20.2f%s",bmi,"Obese");
    }
}
