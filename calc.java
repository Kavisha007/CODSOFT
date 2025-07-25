import java.util.*;

class calc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x, y;
        System.out.println("Enter the first number");
        x = in.nextInt();
        System.out.println("Enter the second number");
        y = in.nextInt();
        System.out.println("------MENU-----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter the operation to perform");
        int ch = in.nextInt();
        switch (ch) {
            case 1:
                System.out.println("You choose Addition");
                double sum = x + y;
                System.out.println("The sum of the two numbers is :" + sum);
                break;
            case 2:
                System.out.println("You choose Subtraction");
                double diff = x - y;
                System.out.println("The difference of the two numbers is :" + diff);
                break;
            case 3:
                System.out.println("You choose Multiplication");
                double pro = x * y;
                System.out.println("The product of the two numbers is :" + pro);
                break;
            case 4:
                System.out.println("You choose Division");
                double div;
                if (x > y)
                    div = x / y;
                else
                    div = y / x;
                System.out.println("The division of the two numbers is :" + div);
                break;
            default:
                System.out.println("Invalid Choice !!! Enter a valid choice ");
        }
    }
}
