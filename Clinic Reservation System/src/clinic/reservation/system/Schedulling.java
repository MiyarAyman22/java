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

    public String getAppointment_reminders() {
        return appointment_reminders;
    }

    public void setAppointment_reminders(String appointment_reminders) {
        this.appointment_reminders = appointment_reminders;
    }

    public boolean isAvailable_time() {
        return available_time;
    }

    public void setAvailable_time(boolean available_time) {
        this.available_time = available_time;
    }

    public boolean isDoctors_avaliable() {
        return doctors_avaliable;
    }

    public void setDoctors_avaliable(boolean doctors_avaliable) {
        this.doctors_avaliable = doctors_avaliable;
    }

    public String getPatient_appointment() {
        return patient_appointment;
    }

    public void setPatient_appointment(String patient_appointment) {
        this.patient_appointment = patient_appointment;
    }

    @Override
    public String toString() {
        return "Schedulling{" + "appointment_reminders=" + appointment_reminders + ", available_time=" + available_time + ", doctors_avaliable=" + doctors_avaliable + ", patient_appointment=" + patient_appointment + '}';
    }

  
    
    
    
}
