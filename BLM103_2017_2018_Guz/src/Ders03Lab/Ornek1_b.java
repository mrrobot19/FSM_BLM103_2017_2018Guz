/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ders03Lab;

/**
 *
 * @author anizam
 */
public class Ornek1_b {
    public static void main(String[] args) {
        int ogrenciNotu = 8;

        String harfNotu;

        harfNotu = (ogrenciNotu <= 100 && ogrenciNotu > 70) ? "AA" : "";

        harfNotu = (ogrenciNotu <= 70 && ogrenciNotu > 40) ? "CC" : harfNotu;

        harfNotu = (ogrenciNotu <= 40 && ogrenciNotu > 0) ? "FF" : harfNotu;

        System.out.println("harf notu : " + harfNotu);
    }
}
