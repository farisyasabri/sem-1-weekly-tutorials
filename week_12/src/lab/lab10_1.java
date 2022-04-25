package lab;

public class lab10_1 {
    public static void main(String[] args) {
        SubstitutionCipher a = new SubstitutionCipher("saya farisya","dlq",3);
        ShuffleCipher b = new ShuffleCipher("abcde","akaka",1);
        getCode(a);
        getCode(b);
        System.out.println(a);
        System.out.println(b);
    }

    public static void getCode(MessageEncoder a){
        a.encode();
        a.decode();
    }
}
