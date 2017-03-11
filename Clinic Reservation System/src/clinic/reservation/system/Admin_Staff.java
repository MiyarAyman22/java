/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;

import java.util.logging.Logger;

public class Admin_Staff extends Manager
{
    protected int Id;
    protected String mail;
    protected String view_invoices;
    protected String clinician;
   protected String Maintaining_supplies;
    
            protected String view_Orders;

    public Admin_Staff(String Name, String Mail, int mobile_phone) {
        super(Name, Mail, mobile_phone);
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String getMail() {
        return Mail;
    }

    @Override
    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public String getView_invoices() {
        return view_invoices;
    }

    public void setView_invoices(String view_invoices) {
        this.view_invoices = view_invoices;
    }

    public String getClinician() {
        return clinician;
    }

    public void setClinician(String clinician) {
        this.clinician = clinician;
    }

    public String getMaintaining_supplies() {
        return Maintaining_supplies;
    }

    public void setMaintaining_supplies(String Maintaining_supplies) {
        this.Maintaining_supplies = Maintaining_supplies;
    }

    public String getView_Orders() {
        return view_Orders;
    }

    public void setView_Orders(String view_Orders) {
        this.view_Orders = view_Orders;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

   

    @Override
    public int getMobile_phone() {
        return mobile_phone;
    }

    @Override
    public void setMobile_phone(int mobile_phone) {
        this.mobile_phone = mobile_phone;
    }
    private static final Logger LOG = Logger.getLogger(Admin_Staff.class.getName());

    @Override
    public String toString() {
        return "Admin_Staff{" + "Id=" + Id + ", Mail=" + Mail + ", view_invoices=" + view_invoices + ", clinician=" + clinician + ", Maintaining_supplies=" + Maintaining_supplies + ", view_Orders=" + view_Orders + '}';
    }

    
    }

   
            
    
    


