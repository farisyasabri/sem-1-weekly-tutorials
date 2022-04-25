package lab;

public class SubstitutionCipher implements MessageEncoder {
    private String inputFileName;
    private String outputFileName;
    private int shift;

    public SubstitutionCipher(String inputFileName, String outputFileName, int shift) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        this.shift = shift;
    }

    public char[] encode(){

        System.out.print("ENCODE: ");
        char[] result = new char[inputFileName.length()];
        char[] message = inputFileName.toCharArray();
        System.out.println(inputFileName.length());
        for (int i=0;i<inputFileName.length();i++){
            int newPosition;
            int original = message[i];
            newPosition = (original + shift);
            if (message[i]==32)
                newPosition=message[i];
            if (newPosition>122){
                int diff = newPosition-122;
                newPosition = 96+diff;
            }
            if (newPosition>90&&newPosition<97) {
                int diff = newPosition-90;
                newPosition = 64+diff;
            }
            result[i]=(char)newPosition;
            System.out.print(result[i]);
        }
        System.out.println();
        return result;
    }

    public char[] decode(){

        System.out.print("DECODE: ");
        char[] result = new char[outputFileName.length()];
        char[] message = outputFileName.toCharArray();
        System.out.println(outputFileName.length());
        for (int i=0;i<outputFileName.length();i++){
            int newPosition;
            int original = message[i];
            newPosition = (original - shift);
            if (message[i]==32)
                newPosition=message[i];
            if (newPosition<97&&newPosition>90){
                int diff = 97-newPosition;
                newPosition = 121-diff;
            }
            if (newPosition<65) {
                int diff = 65- newPosition;
                newPosition = 90-diff;
            }
            result[i]=(char)newPosition;
            System.out.print(result[i]);
        }
        System.out.println();
        return result;
    }
}
