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
public class Clinic_Owner {
    private String Name;
    private String Mail;
    private String Address;
    private int Mobile_phone;
    public void Name(String Clinic_OwnerName )
    {
     this.Name=Clinic_OwnerName;
    }
    public void mail(String Clinic_OwnerMail)
    {
        this.Mail=Clinic_OwnerMail;
    }
    public void Address(String Clinic_OwnerAddress)
    {
        this.Address=Clinic_OwnerAddress;
    }
    public void Mobile_phone(int Clinic_OwnerMobile_phone)
    {
        this.Mobile_phone=Clinic_OwnerMobile_phone;
    }
}
