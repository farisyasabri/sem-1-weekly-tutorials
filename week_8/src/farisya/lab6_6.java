package farisya;

public class lab6_6 {
    public static void main(String[] args) {
        palindromic();
        //emirp();
    }

    public static void palindromic(){
        for (int i=0;i<20;i++){
            for (int k=2;i>k;k++){
                if (i==2 || i%k!=0){
                    System.out.print(i + " ");
                }
            }
        }
    }

    //public static int emirp(){

    //}
}
