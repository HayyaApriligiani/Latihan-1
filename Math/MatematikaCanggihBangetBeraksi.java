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
public class MatematikaCanggihBangetBeraksi {
     public static void main (String[]args){
        MatematikaCanggihBanget Math = new MatematikaCanggihBanget();
       Math.setPertambahan(67,99); 
        System.out.println("It's pertambahan:" + Math.getPertambahan());
       Math.setPengurangan (45,37);
        System.out.println("It's pengurangan:" + Math.getPengurangan());
       Math.setPerkalian(85, 39);
        System.out.println("It's perkalian:" + Math.getPerkalian());
       Math.setPembagian(50,65);
        System.out.println("It's pembagian:" + Math.getPembagian());
       Math.setModulus(50,500);
        System.out.println("It's modulus:" + Math.getModulus());
       Math.setPertambahanTiga(40,70,88);
        System.out.println("It's pertambahan tiga:" + Math.getPertambahanTiga());
        
        
    }    
}
