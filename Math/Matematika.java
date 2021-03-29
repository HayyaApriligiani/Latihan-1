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
public class Matematika {
    private int a,b, 
        Pertambahan, Pengurangan, Perkalian, Pembagian;
        int hasil1, hasil2, hasil3, hasil4;
        double hasilA, hasilB, hasilC, hasilD;

void setPertambahan (int a, int b){
    Pertambahan = a+b;
}
int getPertambahan(){
    return Pertambahan;
}
void setPengurangan (int a, int b){
    Pengurangan = a-b;
}
int getPengurangan(){
    return Pengurangan;
}
void setPerkalian (int a, int b){
    Perkalian = a*b;
}
int getPerkalian(){
    return Perkalian;
}
void setPembagian (int a, int b){
    Pembagian = a/b;
}
int getPembagian(){
    return Pembagian;
}
    public void Pertambahan (int a, int b){
    hasil1= a+b;
    System.out.println("Pertambahan:" + a + "+" + b + "=" + hasil1);
}
public void Pengurangan (int a, int b){
    hasil2= a-b;
    System.out.println("Pengurangan:"+ a + "-" + b + "=" + hasil2);
}
public void Perkalian (int a, int b){
    hasil3= a*b;
    System.out.println("Perkalian:" + a + "*" + b + "=" + hasil3);
}
public void Pembagian (int a, int b) {
    hasil4= a/b;
    System.out.println("Pembagian:" + a + "/" + b + "=" + hasil4);
}
public void Pertambahan (double a, double b, double c){
    hasilA= a + b + c;
    System.out.println("Pertambahan:" + a + "+" + b + "+" + c + "=" + hasilA);
}
public void Pengurangan (double a, double b, double c){
    hasilB= a - b - c;
    System.out.println("Pengurangan:" + a + "-" + b + "-" + c + "=" + hasilB);
}
public void Perkalian (double a, double b, double c){
    hasilC= a * b * c;
    System.out.println("Perkalian:" + a + "" + b + "" + c + "=" + hasilC);
}
public void Pembagian (double a, double b, double c){
    hasilD= a / b / c;
    System.out.println("Pembagian:" + a + "/" + b + "/" + c+ "=" + hasilD);
}
}
