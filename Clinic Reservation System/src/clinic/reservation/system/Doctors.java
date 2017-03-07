/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;

/**
 *
 * @author Hp
 */
public class Doctors {
    private int ID;
    private String Name;
    private int mail;
            private int Specialization;
                    private int full_time;
                            private int half_time;
                            
    public void ID(int DoctorsID)
    {
        this.ID=DoctorsID;
    }
    public void Name(int DoctorsName)
    {
        this.Name=DoctorsName;
    }
    public void mail(int Doctorsmail)
    {
        this.mail=Doctorsmail;
    }
    public void Specialization(int DoctorsSpecialization)
    {
        this.Specialization=DoctorsSpecialization;
    }
    public void Full_time(int DoctorsFull_time)
    {
    this.Full_time=DoctorsFull_time;
    }
    public void Half_time(int DoctorsHalf_time)
    {
        this.Half_time=DoctorsHalf_time;
    }
    
    
    
    
    
    
    
    
}
