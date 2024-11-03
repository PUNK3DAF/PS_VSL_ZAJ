/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author vldmrk
 */
public class Slovo implements Serializable {

    private char karakter;
    private int pozicija;

    public Slovo() {
    }

    public Slovo(char karakter, int pozicija) {
        this.karakter = karakter;
        this.pozicija = pozicija;
    }

    public char getKarakter() {
        return karakter;
    }

    public void setKarakter(char karakter) {
        this.karakter = karakter;
    }

    public int getPozicija() {
        return pozicija;
    }

    public void setPozicija(int pozicija) {
        this.pozicija = pozicija;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Slovo other = (Slovo) obj;
        if (this.pozicija != other.pozicija) {
            return false;
        }
        return Objects.equals(this.karakter, other.karakter);
    }

    @Override
    public String toString() {
        return "Slovo{" + "karakter=" + karakter + ", pozicija=" + pozicija + '}';
    }

}
