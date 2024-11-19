public class Manusia {
    //atribut/karakteristrik dari objek manusia
    static String nama; // --> static variable
    private int umur; // --> instance variable (milik classnya)
    private boolean masihHidup; // --> instance variable (milik objeknya)

    Manusia(String nama, int umur, boolean masihHidup) {
        Manusia.nama = nama;
        this.umur = umur;
        this.masihHidup = masihHidup;
    }

    //method/action dari objek manusia
    void printIdentitas() {
        System.out.println("Nama: " + Manusia.nama);
        System.out.println("Umur: " + umur);
        System.out.println("Masih hidup: " + masihHidup);
    }

    //getter
    String getNama() {
        return Manusia.nama;
    }

    int getUmur() {
        return umur;
    }

    boolean getMasihHidup() {
        return masihHidup;
    }

    //setter
    void setNama(String nama) {
        Manusia.nama = nama; //karena nama static (milik si class)
    }

    void setUmur(int umur) {
        this.umur = umur;
    }

    void setMasihHidup(boolean masihHidup) {
        this.masihHidup = masihHidup;
    }
}
