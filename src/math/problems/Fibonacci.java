package math.problems;

public class Fibonacci {
    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        int n = 40;
        int num1 = 0;
        int num2 = 1;


        System.out.println("The first " + n + " Fibonacci numbers are:");
        System.out.println(num1);
        System.out.println(num2);

//       public int
        for (int i = 1; i<=n-2; ++i)
        {
            int sum = num1 + num2;
            num1 = num2;
            num2 = sum;
            System.out.println(sum);


        }

    }
}
