import java.io.Serializable;

/**
 * Created by Bogdan on 15-10-2017.
 */
public class KlasaB extends KlasaA implements Serializable {
    private int i = 3;
    protected static int j=0;
	private final int id = 100;
	private final int st = -1;
    public KlasaB() {
        System.out.println("Konstruktor KlasyB");
    }
    static {
        System.out.println("Blok static KlasyB");
        System.out.println("Wartość zmiennej j przed zmianą w klasie B = " + j);
        j = 9;
        System.out.println("Wartość zmiennej j po zmianie w klasie B = " + j);
    }

    public void foo() {
        System.out.println("funkcja foo() KlasyB");
    }
}
