import java.io.Serializable;

/**
 * Created by Bogdan on 15-10-2017.
 */
public class KlasaA implements Serializable {
    private int d;
    private String napis;
	private Double stanKonta;

    public KlasaA() {
        System.out.println("Konstruktor KlasyA");
        //System.out.println("KlasaA: wartość zmiennej d = " + d);
        //System.out.println("KlasaA: wartość zmiennej napis = " + napis);
    }
    static {
        System.out.println("Blok static KlasyA");
    }

    {
        d = 12;
        napis = "KlasaA zmienna napis";
        System.out.println("KlasaA: wartość zmiennej d = " + d);
        System.out.println("KlasaA: wartość zmiennej napis = " + napis);
    }
	
	public String getNapis() {
		return napis;
	}
}
