package sem1;

import java.util.Random;

public class Number_lab {

    private int numToGenerate, bound;

    public Number_lab() {
        numToGenerate=10;
        bound=100;
    }

    public Number_lab(int numToGenerate) {
        this.numToGenerate = numToGenerate;
    }

    public Number_lab(int numToGenerate, int bound) {
        this.numToGenerate = numToGenerate;
        this.bound = bound;
    }

    public static int[] generateNum(int numToGenerate, int bound){
        Random r = new Random();
        int[] number = new int[bound];
        for (int i=0;i<numToGenerate;i++){
            number[i] = r.nextInt(numToGenerate);
        }
        return number;
    }

    public static int[] evenNumber(int[] generateNum){
        int even;
        int[] arrayEven = new int[generateNum.length];
        for (int i=0;i<generateNum.length;i++){
            even=generateNum[0]%2;
            if (even==0){
                arrayEven[i]=i;
            }
        }
        return arrayEven;
    }

    public static int maximumNum(int[] generateNum){
        int max=generateNum[0];
        int num2;
        for (int i=1;i<generateNum.length;i++){
            num2= generateNum[i];
            if (max<num2){
                max=num2;
            }
        }
        return max;
    }

    public static int minimumNum(int[] generateNum){
        int min=generateNum[0];
        int num2;
        for (int i=1;i<generateNum.length;i++){
            num2= generateNum[i];
            if (min>num2){
                min=num2;
            }
        }
        return min;
    }

    public static double averageNum(int[] generateNum){
        int sum=0;
        double average;

        for (int i=0;i<generateNum.length;i++){
            sum+=generateNum[i];
        }
        average=sum/generateNum.length;

        return average;
    }
}
