public class Paket {
    public static void main(String[] args) {
        PriorityScheduler daftarPaket = new PriorityScheduler();

        daftarPaket.terimaPaket(1, "Yuli", 5, "express",  "Jl. Ciganitri no. 15");
        daftarPaket.terimaPaket(2, "Kiki", 6, "kilat",  "Jl. Pogor no. 11");
        daftarPaket.terimaPaket(3, "Toto", 7, "biasa", "Jl. Sukabirus no. 15");
        daftarPaket.terimaPaket(4, "Juni", 8, "express", "Jl Telekomunikasi no. 2");
        daftarPaket.terimaPaket(5, "Julia", 8, "same day", "Jl. Ciganitri no. 13");
        daftarPaket.terimaPaket(6, "Agus", 9, "biasa", "Jl. Ciganitri no. 23");

        System.out.println("Urutan paket harus diselesaikan: ");
        daftarPaket.listJadwal();

    }
}
