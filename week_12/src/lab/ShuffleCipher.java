package lab;

public class ShuffleCipher implements MessageEncoder{
    private String inputFileName;
    private String outputFileName;
    private int N;

    public ShuffleCipher(String inputFileName, String outputFileName, int n) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        N = n;
    }

    public char[] encode(){
//        char[] result = new char[outputFileName.length()];
        char[] message = inputFileName.toCharArray();
        int length = inputFileName.length();
        int i=0;
        while (i<N){
            System.out.println("masuk");
            length = length/2;
//            if (length==0){
                for (int j=0;j<length;j++){
                    char temp = message[i];
                    message[i] = message[length*2-1];
                    message[length*2-1] =temp;
                }
//            }
//            if (length!=0){
//                for (int j=0;j<length;j++){
//                    char temp = message[i];
//                    message[i] = message[length*2-1];
//                    message[length*2-1] =temp;
//                }
//                message[length+1]=message[i];
//            }
            i++;
        }
        for (i=0;i<inputFileName.length();i++){
            System.out.print(message[i]);
        }
        return message;
    }

    @Override
    public char[] decode() {
        return new char[0];
    }

}
