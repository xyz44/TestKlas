/**
 * Created by Bogdan on 15-10-2017.
 */
import java.io.Serializable;
import java.util.regex.Pattern;
//import  java.util.regex.Matcher;

public class KlasaC extends KlasaB implements Serializable {
	private String nameOfCountry;
    static {
        System.out.println("Blok static KlasyC");
        System.out.println("Wartość zmiennej j  w klasie C = " + j);
    }
    public KlasaC() {
        super();
        System.out.println("Konstruktor KlasyC");
		nameOfCountry = "";
    }

    public void foo() {
        //super.foo();
        System.out.println("Funkcja foo() KlasyC");
    }
    public void testSymbolDotWithOthers() {
        Pattern pattern = Pattern.compile("k+a.*ta");
        Pattern p1 = Pattern.compile("\\d{2}-\\d{3}");
        System.out.println(pattern.matcher("katapulta").matches());
        System.out.println(pattern.matcher("karta").matches());
        System.out.println(pattern.matcher("kasia ma kota").matches());
        System.out.println(pattern.matcher("kkkka#$*&JHDFSta").matches());
        System.out.println(pattern.matcher("ata").matches());
        System.out.println(pattern.matcher("kta").matches());
        System.out.println("To jest - " + pattern.matcher("katarakta").matches());
        System.out.println(p1.matcher("00-910").matches());
    }
	
	public String getNameOfCountry() {return nameOfCountry;}
}
