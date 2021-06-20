import model.Mahasiswa;

public class main {
    public static void main (String[]args){
        Mahasiswa m1 = new Mahasiswa("19637777", "pitung", "07-07-2007");
        m1.tampilkanAtribut();
        System.out.println(m1.getNama());

    }

}
