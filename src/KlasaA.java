/**
 * Created by Bogdan on 15-10-2017.
 */
public class KlasaA {
    private int d;
    private String napis;

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
	
	public void getNapis() {
		return napis;
	}
}
