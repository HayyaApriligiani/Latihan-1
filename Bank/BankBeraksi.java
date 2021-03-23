//Nama  : Hayya Apriligiani Mutiara Riadi
//Nim   : 11200930000003
//Kelas : 2A - Sistem Informasi

package Bank;
public class BankBeraksi {
    public static void main(String[] args){
        
        Bank getBank = new Bank(100000); 
        getBank.simpanUang(500000);
        getBank.ambilUang(150000);
    }
}
