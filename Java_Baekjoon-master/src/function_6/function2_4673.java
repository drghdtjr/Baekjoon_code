package function_6;

public class function2_4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for (int i = 1; i < 10001; i++) {
            int num = d(i);
            if (num < 10001) {
                check[num] = true;
            }
        }
        for (int i = 1; i < 10001; i++) {

            if (!check[i]) {
                System.out.println(i);
            }
        }


    }

    public static int d(int number)
    {
        int sum = number;
        while (number > 0)
        {
            sum = sum + (number % 10);
            number = number / 10;
        }
        return sum;
    }

}

