public class MainManusia {
    public static void main(String[] args) {
        //instansiasi objek manusia
        Manusia manusia1 = new Manusia("Indah", 20, true);
        
        //static --> diakses langsung melalui class
        System.out.println(Manusia.nama);

        //instance variable/method --> diakses melalui objeknya, bukan class
        System.out.println(manusia1.getNama());
        System.out.println(manusia1.getUmur());
        System.out.println(manusia1.getMasihHidup());
        manusia1.printIdentitas();
    }
}
