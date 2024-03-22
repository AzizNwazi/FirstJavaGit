// ZiyaretciKuyrugu sınıfı, ziyaretçileri tutan kuyruğu temsil eder
public class ZiyaretciKuyrugu {
    Ziyaretci front; // Kuyruğun önündeki ziyaretçiyi işaret eden referans
    Ziyaretci rear; // Kuyruğun sonundaki ziyaretçiyi işaret eden referans
    int size; // Kuyruktaki ziyaretçi sayısını izlemek için değişken
    int kullaniciGirisi;

    // Constructor
    public ZiyaretciKuyrugu() {
        this.front = null;
        this.rear = null;
        this.size = 0; // Başlangıçta kuyruk boş olduğu için 0
    }

    public ZiyaretciKuyrugu(int kullaniciGirisi) {
        this.kullaniciGirisi = kullaniciGirisi; // kapasiteyi kullanıcı belirler
        this.front = null;
        this.rear = null;
        this.size = 0; // Başlangıçta kuyruk boş olduğu için 0
    }

    // Yeni bir ziyaretçi eklemek için
    public void enqueue(String data) {
        if (size >= kullaniciGirisi) { // Maksimum sayı kontrolü (3 belirlendi)
            System.out.println("\nMaksimum ziyaretçi sayısı " + kullaniciGirisi + " dolmuştur!!!\n"); // Eğer kuyruk doluysa kullanıcıya bilgi ver
            return;
        }

        Ziyaretci temp = new Ziyaretci(data); // Yeni ziyaretçi nesnesi oluştur

        if (front == null) { // Eğer kuyruk boşsa
            front = rear = temp; // Kuyruğun önüne ve sonuna yeni ziyaretçiyi ekle
        } else {
            rear.next = temp; // Eğer kuyruk doluysa, son ziyaretçinin sonraki referansını yeni ziyaretçiye bağla
            rear = temp; // Yeni ziyaretçiyi kuyruğun sonu olarak belirle
        }

        size++; // Ziyaretçi eklendiğinde boyutu artır
    }

    // Kuyruğun başındaki ziyaretçiyi kaldırmak için
    public void dequeue() {
        if (front == null) {
            System.out.println("\nKuyruk boş"); // Kuyruk boşsa işlem yapılmaz, kullanıcıya bilgi ver
            return;
        }

        front = front.next; // Kuyruğun önündeki ziyaretçiyi bir sonraki ziyaretçi olarak güncelle

        if (front == null) {
            rear = null; // Eğer kuyrukta sadece bir ziyaretçi varsa rear'i de null yap
        }

        size--; // Ziyaretçi kuyruktan çıkarıldığında boyutu azalt
        System.out.println("Kuyruk ilerledi...");
    }

    // Kuyruğu yazdırmak için
    public void yazdir() {
        Ziyaretci temp;
        temp = front; // Geçici bir referansla kuyruğun başlangıcını işaret et

        System.out.println("\nKuyruğun Güncel Hali:");
        while (temp != null) {
            System.out.print(temp.data + " ->> "); // Ziyaretçileri sırayla yazdır
            temp = temp.next; // Bir sonraki ziyaretçiye geç
        }
        System.out.println();
    }
}