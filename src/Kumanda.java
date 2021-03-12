
import java.util.Date;

public abstract class Kumanda {

    
    
    private String firmaIsmi;
    public int pilSayisi;
    public int tusSayisi;
    private Date uretilmeTarihi;

    public Kumanda(String firmaIsmi, int pilSayisi, int tusSayisi, Date uretilmeTarihi) {
        this.firmaIsmi = "f";
        this.pilSayisi = pilSayisi;
        this.tusSayisi = tusSayisi;
        this.uretilmeTarihi = uretilmeTarihi;
    }
    
}