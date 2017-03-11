/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;
import java.util.Scanner;
import java.util.logging.Logger;


public class Booking {
private int Spn;
private  boolean Update;
private  boolean Cancel;
private boolean Avaliable_time;
private boolean search_doctors;
private int view_therapy_money;
private boolean Book;

    public Booking(int Spn, boolean Update, boolean Cancel, boolean Avaliable_time, boolean search_doctors, int view_therapy_money, boolean Book) {
        this.Spn = Spn;
        this.Update = Update;
        this.Cancel = Cancel;
        this.Avaliable_time = Avaliable_time;
        this.search_doctors = search_doctors;
        this.view_therapy_money = view_therapy_money;
        this.Book = Book;
    }

    public int getSpn() {
        return Spn;
    }

    public void setSpn(int Spn) {
        this.Spn = Spn;
    }

    public boolean isUpdate() {
        return Update;
    }

    public void setUpdate(boolean Update) {
        this.Update = Update;
    }

    public boolean isCancel() {
        return Cancel;
    }

    public void setCancel(boolean Cancel) {
        this.Cancel = Cancel;
    }

    public boolean isAvaliable_time() {
        return Avaliable_time;
    }

    public void setAvaliable_time(boolean Avaliable_time) {
        this.Avaliable_time = Avaliable_time;
    }

    public boolean isSearch_doctors() {
        return search_doctors;
    }

    public void setSearch_doctors(boolean search_doctors) {
        this.search_doctors = search_doctors;
    }

    public int getView_therapy_money() {
        return view_therapy_money;
    }

    public void setView_therapy_money(int view_therapy_money) {
        this.view_therapy_money = view_therapy_money;
    }

    public boolean isBook() {
        return Book;
    }

    public void setBook(boolean Book) {
        this.Book = Book;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + (this.Update ? 1 : 0);
        hash = 97 * hash + (this.Cancel ? 1 : 0);
        hash = 97 * hash + (this.Avaliable_time ? 1 : 0);
        hash = 97 * hash + (this.search_doctors ? 1 : 0);
        hash = 97 * hash + (this.Book ? 1 : 0);
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
        final Booking other = (Booking) obj;
        if (this.Update != other.Update) {
            return false;
        }
        if (this.Cancel != other.Cancel) {
            return false;
        }
        if (this.Avaliable_time != other.Avaliable_time) {
            return false;
        }
        if (this.search_doctors != other.search_doctors) {
            return false;
        }
        if (this.Book != other.Book) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Booking{" + "Spn=" + Spn + ", Update=" + Update + ", Cancel=" + Cancel + ", Avaliable_time=" + Avaliable_time + ", search_doctors=" + search_doctors + ", view_therapy_money=" + view_therapy_money + ", Book=" + Book + '}';
    }





    
    
    
    
    
    
    
    
    
    
}
