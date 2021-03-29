/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Math;

/**
 *
 * @author Hayya AM Riadi
 */
public class MatematikaCanggih extends Matematika {
    private int Modulus, a, b;
            int Modulus1; 
            double Modulus2;
            
    void setModulus(int a, int b){
        Modulus = a%b;
    }
    int getModulus(){
        return Modulus;
    }
     public void Modulus(int a, int b){
        Modulus1 = a%b;
        System.out.println("Modulus1:" + a + "%" + b + "=" + Modulus1 );
    }
    public void Modulus(double a, double b, double c){
        Modulus2 = a%b%c;
        System.out.println("Modulus2:"+ a + "%" + b + "%" + c + "=" + Modulus2 );
    }
}
