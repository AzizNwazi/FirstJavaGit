import java.util.Scanner;

// Ana sınıf, uygulamanın giriş noktası
public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.print("Kapasiteyi giriniz: ");
        int kullaniciGirisi = scanner.nextInt();

        ZiyaretciKuyrugu z = new ZiyaretciKuyrugu(kullaniciGirisi);


        // Ziyaretçileri kuyruğa eklemek
        z.enqueue("Ahmet Enünlü");
        z.enqueue("Mahmut Irmak");
        z.enqueue("Tunahan Güler");
        z.enqueue("Furkan Er");
        z.enqueue("Serdar Aktolga");
        z.enqueue("Sami Hamidi");
        z.enqueue("Mike Hentzel");

        z.yazdir(); // Kuyruğun mevcut durumunu yazdır

        // Bir ziyaretçiyi kuyruktan çıkarmak
        z.dequeue();
        z.yazdir(); // Kuyruğun güncel durumunu yazdır
    }
}