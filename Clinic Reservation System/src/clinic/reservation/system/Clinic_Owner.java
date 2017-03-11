/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;
import java.util.Scanner;
import java.util.logging.Logger;

/**
 *
 * @author Hp
 */
public class Clinic_Owner extends Manager {
    protected String name;
    protected String mail;
    protected String Address;
    protected int Mobile_phone;

    public Clinic_Owner(String name, String mail, String Address, int Mobile_phone, String Name, String Mail, int mobile_phone) {
        super(Name, Mail, mobile_phone);
        this.name = name;
        this.mail = mail;
        this.Address = Address;
        this.Mobile_phone = Mobile_phone;
    }

    

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getMail() {
        return mail;
    }

    @Override
    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public int getMobile_phone() {
        return Mobile_phone;
    }

    @Override
    public void setMobile_phone(int Mobile_phone) {
        this.Mobile_phone = Mobile_phone;
    }
    private static final Logger LOG = Logger.getLogger(Clinic_Owner.class.getName());

    @Override
    public String toString() {
        return "Clinic_Owner{" + "name=" + name + ", mail=" + mail + ", Address=" + Address + ", Mobile_phone=" + Mobile_phone + '}';
    }

   
    
   
    
    
    
    
}
