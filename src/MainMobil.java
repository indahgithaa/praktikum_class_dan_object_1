
import java.util.Scanner;

public class MainMobil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // input dari terminal
        System.out.print("Masukkan kecepatan mobil: ");
        int kecepatan1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan nama manufaktur: ");
        String manufaktur1 = scanner.nextLine();
        System.out.print("Masukkan no plat: ");
        String noplat1 = scanner.nextLine();
        System.out.print("Masukkan warna mobil: ");
        String warna1 = scanner.nextLine();
        System.out.print("Masukkan waktu tempuh mobil (dalam satuan jam): ");
        double waktu1 = scanner.nextDouble();

        // instan objek bernama m1
        Mobil m1 = new Mobil();
        m1.setKecepatan(kecepatan1);
        m1.setManufaktur(manufaktur1);
        m1.setNoPlat(noplat1);
        m1.setWarna(warna1);
        m1.setWaktu(waktu1);
        m1.displayMessage();
        System.out.println("================");

        // input dari terminal
        System.out.print("Masukkan kecepatan mobil: ");
        int kecepatan2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan nama manufaktur: ");
        String manufaktur2 = scanner.nextLine();
        System.out.print("Masukkan no plat: ");
        String noplat2 = scanner.nextLine();
        System.out.print("Masukkan warna mobil: ");
        String warna2 = scanner.nextLine();
        System.out.print("Masukkan waktu tempuh mobil (dalam satuan jam): ");
        double waktu2 = scanner.nextDouble();

        // instan objek baru bernama m2
        Mobil m2 = new Mobil();
        m2.setKecepatan(kecepatan2);
        m2.setManufaktur(manufaktur2);
        m2.setNoPlat(noplat2);
        m2.setWarna(warna2);
        m2.setWaktu(waktu2);
        m2.displayMessage();
        System.out.println("================");
        // merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna Hijau");
        m1.setWarna("Hijau");
        // menampilkan hasil perubahan
        m1.displayMessage();
    }
}
