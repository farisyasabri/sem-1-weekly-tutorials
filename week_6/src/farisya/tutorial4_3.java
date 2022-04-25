package farisya;

public class tutorial4_3 {
    public static void main(String[] args) {
        //int sum=0;
        //System.out.println("f1 ; 1");
        int num1 = 0, num2 = 1,sum;

        System.out.println("first 10 number of fibonacci:");
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(num1 + " + ");

            sum = num1 + num2;
            num1 = num2;
            num2 = sum ;
        }
    }
}
