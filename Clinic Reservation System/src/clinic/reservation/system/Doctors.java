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
    private String mail;
            private String Specialization;
                    private boolean full_time;
                            private boolean half_time;
                            
    public void ID(int DoctorsID)
    {
        this.ID=DoctorsID;
    }
    public void Name(String DoctorsName)
    {
        this.Name=DoctorsName;
    }
    public void mail(String Doctorsmail)
    {
        this.mail=Doctorsmail;
    }
    public void Specialization(String DoctorsSpecialization)
    {
        this.Specialization=DoctorsSpecialization;
    }
    public void Full_time(boolean DoctorsFull_time)
    {
    this.Full_time=DoctorsFull_time;
    }
    public void Half_time(boolean DoctorsHalf_time)
    {
        this.Half_time=DoctorsHalf_time;
    }
    
    
    
    
    
    
    
    
}
