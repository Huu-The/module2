import  java.util.Scanner;

public class nam {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));

        System.out.print("Which month that you want to count day?");
        int month = sc.nextInt();
        String dayInmonth;
        switch (month) {
            case 2:
                System.out.print("Which month '2' has 28 or 29 days!");
                break;

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
               System.out.print("the month '" + month + "'has 31 day!");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
               System.out.print("the mon '" + month +"'has 30 day!");
                break;
            default:
                System.out.print("Invalid input!");

        }
       // if (dayInmonth != "") System.out.printf("the month '%d' has %s days !");
      //  else  System.out.print(" Invalid input!");
    }
}