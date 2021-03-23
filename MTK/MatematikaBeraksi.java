//Nama  : Hayya Apriligiani Mutiara Riadi
//Nim   : 11200930000003
//Kelas : 2A - Sistem Informasi

package MTK;
public class MatematikaBeraksi {
    public static void main(String[] args){
        Matematika getNilai = new Matematika();
        
        getNilai.pertambahan(20, 20);
        System.out.println("Pertambahan: 20+20 = " + getNilai.getkalkulasi());
        
        getNilai.pengurangan(10, 5);
        System.out.println("Pengurangan: 10-5 = " + getNilai.getkalkulasi());
        
        getNilai.perkalian(10, 20);
        System.out.println("Perkalian: 10*20 = " + getNilai.getkalkulasi());
        
        getNilai.pembagian(21, 2);
        System.out.println("Pembagian: 21/2 = " + getNilai.getkalkulasi());
        
        
    }
    
}
