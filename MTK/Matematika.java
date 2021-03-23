//Nama  : Hayya Apriligiani Mutiara Riadi
//Nim   : 11200930000003
//Kelas : 2A - Sistem Informasi

package MTK;
public class Matematika {
    
    int kalkulasi;
    
    //Methode pertambahan
    public void pertambahan(int a, int b){
        kalkulasi = a + b;
    }
    
    //Methode pengurangan
    public void pengurangan(int a, int b){
        kalkulasi = a - b;
    }
    //Methode perkalian
    public void perkalian(int a, int b){
        kalkulasi = a * b;
    }
    //Methode pembagian
    public void pembagian(int a, int b){
        kalkulasi = a / b;
    }
    int getkalkulasi(){
        return kalkulasi;
    }
}
