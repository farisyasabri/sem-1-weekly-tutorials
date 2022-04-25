package farisya;

public class lab6_1 {
    public static void main(String[] args) {

        for (int i=1; i<=20; i++) {
            triangular(i);
            System.out.print(triangular(i) + " ");
        }
    }

    public static int triangular(int i){
        int num=0;
        for (int x=1; x<=i;x++){
            num= num+x;
        }
        return num;
    }


}

