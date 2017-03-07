/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;
        

public class Booking {
private int ID;
private  int Update;
private  int Cancel;
private int Avaliable_time;
private int search_doctors;
private int view_therapy_money;
    public void ID(int BookingID)
    {
        this.ID=BookingID;
    }
    public void Update(int BookingUpdate)
    {
    this.Update=BookingUpdate;
    }
    public void Cancel (int BookingCancel)
    {
        this.Cancel=BookingCancel;
    }
    public void Avaliable_time(int BookingAvaliable_time)
    {
        this.Avaliable_time=BookingAvaliable_time;
    }
    public void search_doctors(int Bookingsearch_doctors)
    {
    this.search_doctors=Bookingsearch_doctors;
    }
    public void view_therapy_money(int Bookingview_therapy_money)
    {
        this.view_therapy_money=Bookingview_therapy_money;
    }
    
    
    
    
    
    
    
    
    
    
}
