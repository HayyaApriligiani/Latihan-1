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
    public class MatematikaCanggihBanget extends MatematikaCanggih {
    private int PertambahanTiga, a, b, c;
    void setPertambahanTiga (int a, int b, int c){
       PertambahanTiga = a+b+c;
    }
    int getPertambahanTiga(){
        return PertambahanTiga;
    }
}
