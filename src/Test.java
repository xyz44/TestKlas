/**
 * Created by Bogdan on 15-10-2017.
 */
public class Test {
    public static void main(String[] args) {
        KlasaC obC;
        long argb = 370208L;
        long maska = 255L;

        obC = new KlasaC();
        obC.foo();
        System.out.println("------------------------------------------");
        KlasaA kl = new KlasaC();
        KlasaB klB = (KlasaB) kl;
        klB.foo();
        System.out.println(klB);
        //((KlasaB) kl).foo();
        System.out.println("===========================================");
        //System.out.println((argb>>>8)&maska);
        obC.testSymbolDotWithOthers();
    }
}
