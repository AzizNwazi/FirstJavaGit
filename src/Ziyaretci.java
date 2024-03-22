// Ziyaretci sınıfı, her ziyaretçiyi temsil eder
public class Ziyaretci {
    String data; // Ziyaretçiye ait veri
    Ziyaretci next; // Bir sonraki ziyaretçiyi işaret eden referans

    
    // Constructor
    public Ziyaretci() {
        this.data = null;
        this.next = null;
    }

    // Parametre alan constructor
    public Ziyaretci(String data) {
        this.data = data;
        this.next = null;
    }


}