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
public class Schedulling {
    private String appointment_reminders;
    private boolean available_time;
    private boolean doctors_avaliable;
    private String patient_appointment;
   
    
    public void Appointment_reminders(String SchedullingAppointment_reminders)
    {
        this.appointment_reminders=SchedullingAppointment_reminders;
    }
    public void Available_time(boolean SchedullingAvailable_time)
    {
        this.available_time=SchedullingAvailable_time;
    }
    public void Doctors_avaliable(boolean SchedullingDoctors_avaliable)
    {
        this.doctors_avaliable=SchedullingDoctors_avaliable;
    }
    public void Patient_appointment(String SchedullingPatient_appointment)
    {
        this.patient_appointment=SchedullingPatient_appointment;
    }

  
}
