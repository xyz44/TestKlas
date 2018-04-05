/**
 * Created by Bogdan on 15-10-2017.
 */
public class KlasaB extends KlasaA {
    private int i = 3;
    public KlasaB() {
        System.out.println("Konstruktor KlasyB");
    }
    static {
        System.out.println("Z funkcji static KlasyB");
    }

    public void foo() {
        System.out.println("funkcja foo() KlasyB");
    }
}
