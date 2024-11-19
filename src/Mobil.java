public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private int kecepatan;
    private double waktu;

    public void setNoPlat(String s) {
        noPlat = s;
    }

    public void setWarna(String s) {
        warna = s;
    }

    public void setManufaktur(String s) {
        manufaktur = s;
    }

    public void setKecepatan(int i) {
        kecepatan = (int) rubahKecepatan(i);
    }

    private double rubahSekon(double w) {
        return w*3600;
    }

    public void setWaktu(double w) {
        waktu = rubahSekon(w);
    }

    private double rubahKecepatan(double speed) {
        return speed * 1000 / 3600;
    }

    public double hitungJarak() {
        return this.kecepatan * this.waktu;
    }

    public void displayMessage() {
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memiliki warna " + warna);
        System.out.println("dan mampu menempuh kecepatan " + kecepatan + " m/s");
        System.out.println("dalam waktu " + this.waktu + " sekon");
        System.out.println("dengan jarak " + hitungJarak() + " meter");
        System.out.println("atau " + hitungJarak() / 1000 + " kilometer");
    }
}