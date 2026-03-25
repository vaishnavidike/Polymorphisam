package numbers;


public class Test {
    public static void main(String[] args) {
        int num = 145;
        int temp = num;   
        int sum = 0;

        while (temp != 0) {
            int rem = temp % 10;
            sum += isfact(rem);
            temp = temp / 10;
        }

        if (sum == num) {
            System.out.println(num + " is a Strong Number");
        } else {
            System.out.println(num + " is NOT a Strong Number");
        }
    }

    public static int isfact(int num) {
        int pro = 1;
        for (int i = 1; i <= num; i++) {
            pro = pro * i;
        }
        return pro;
    }
}
