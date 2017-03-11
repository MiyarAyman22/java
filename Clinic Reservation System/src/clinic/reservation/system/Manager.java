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
public class Manager {
    protected String Name;
    protected String Mail;
    protected int mobile_phone;

    public Manager(String Name, String Mail, int mobile_phone) {
        this.Name = Name;
        this.Mail = Mail;
        this.mobile_phone = mobile_phone;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public int getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(int mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    @Override
    public String toString() {
        return "Manager{" + "Name=" + Name + ", Mail=" + Mail + ", mobile_phone=" + mobile_phone + '}';
    }
    
}
