public class Manusia {
    //atribut
    static String nama;
    private int umur;
    private boolean masihHidup;

    Manusia(String nama, int umur, boolean masihHidup) {
        this.nama = nama;
        this.umur = umur;
        this.masihHidup = masihHidup;
    }

    //method
    void berjalan() {
        System.out.println(this.nama + " sedang berjalan");
    }

    //getter
    String getNama() {
        return this.nama;
    }

    //setter
    void setNama(String nama) {
        this.nama = nama;
    }
}
