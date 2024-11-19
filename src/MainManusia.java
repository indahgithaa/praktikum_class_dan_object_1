public class MainManusia {
    public static void main(String[] args) {

        //instansiasi objek manusia
        Manusia manusia1 = new Manusia("Indah", 20, true);
        
        //static
        System.out.println(Manusia.nama);

        //instance variable
        System.out.println(manusia1.getNama());
    }
}
