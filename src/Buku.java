public class Buku {
    int lembarBuku;
    double halamanPerHari;

    Buku(int lembar, double halaman) {
        lembarBuku = lembar;
        halamanPerHari = halaman;
    }

    //berapa lama menghabiskan 1 buah buku sesuai Halaman Per Hari
    int hitungLamaBukuHabis() {
        return (int) (lembarBuku * 2 / halamanPerHari);
    }
}
