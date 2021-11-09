package exercise1;
public class Manajer extends Pegawai{
    private int tunjangan;
    
    Manajer(String nama, int gaji, int tunjangan) {
        super(nama, gaji);
        this.tunjangan = tunjangan;
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public int getGaji(){
        return gaji;
    }
}
