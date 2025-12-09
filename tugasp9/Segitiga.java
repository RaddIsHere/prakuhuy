/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp9;

public class Segitiga {
    protected double alas;
    protected double tinggi;

    public Segitiga(double a, double t) {
        this.alas = a;
        this.tinggi = t;
    }

    protected double hitungLuas() {
        return 0.5 * alas * tinggi;
    }
}
