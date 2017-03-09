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
public class Appointments {
    private String patient_comment;
    private int ID;
    private String About_us;
    private char Rate_Us;
    public void patient_comment(String Appointmentspatient_comment)
    {
        this.patient_comment=Appointmentspatient_comment;
    }
    public void ID (int AppointmentsID)
    {
        this.ID=AppointmentsID;
    }
    public void About_us(String AppointmentsAbout_us)
    {
        this.About_us=AppointmentsAbout_us;
    }
    public void Rate_Us(char AppointmentsRate_Us)
    {
        this.Rate_Us=AppointmentsRate_Us;
    }
}
