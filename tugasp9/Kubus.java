/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasp9;

public class Kubus {
    private double sisi;

    public Kubus(double sisi) {
        this.sisi = sisi;
    }

    private double volume() {
        return sisi * sisi * sisi;
    }

    public double getVolume() {
        return volume();
    }
}
