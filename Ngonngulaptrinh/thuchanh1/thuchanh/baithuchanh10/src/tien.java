import java.util.Scanner;

public class tien {
    public static void main(String[] args) {
        double money = 1.0;
        int month = 1;
        double interset_rate = 1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số tiền gửi :");
        money = input.nextDouble();
        System.out.println("Nhập số tháng gửi :");
        month = input.nextInt();
        System.out.println("Nhập lãi suất : ");
        interset_rate = input.nextDouble();
        double total_interset = 0;
        for (int i = 0; i < month; i++) {
            total_interset = money * (interset_rate / 100) / 12 * 3;
        }
        System.out.println("Số tiền phải trả là : " + total_interset);
    }
}