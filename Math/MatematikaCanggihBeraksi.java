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
public class MatematikaCanggihBeraksi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematikaCanggih Math = new MatematikaCanggih();
            
       Math.setPertambahan(20,10); 
        System.out.println("It's pertambahan:" + Math.getPertambahan());
       Math.setPengurangan (40,20);
        System.out.println("It's pengurangan:" + Math.getPengurangan());
       Math.setPerkalian(47, 35);
        System.out.println("It's perkalian:" + Math.getPerkalian());
       Math.setPembagian(33,13);
        System.out.println("It's pembagian:" + Math.getPembagian());
       Math.setModulus(10,100);
        System.out.println("It's modulus:" + Math.getModulus());
    }
}
