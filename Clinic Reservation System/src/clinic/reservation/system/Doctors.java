/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clinic.reservation.system;

import java.util.logging.Logger;

/**
 *
 * @author Hp
 */

public class Doctors extends person {
    protected int ID;
    protected String Name;
    protected String mail;
            protected String Specialization;
                    protected boolean full_time;
                            protected boolean half_time;
                            protected  boolean Update_schedules;
protected  boolean Cancel;
protected String User_Name;
protected String pass;
protected  boolean Update_fees;
protected  boolean Order_medical_supplier;

    public Doctors(int id, String name, int Age, String Address) {
        super(id, name, Age, Address);
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getSpecialization() {
        return Specialization;
    }

    public void setSpecialization(String Specialization) {
        this.Specialization = Specialization;
    }

    public boolean isFull_time() {
        return full_time;
    }

    public void setFull_time(boolean full_time) {
        this.full_time = full_time;
    }

    public boolean isHalf_time() {
        return half_time;
    }

    public void setHalf_time(boolean half_time) {
        this.half_time = half_time;
    }

    public boolean isUpdate_schedules() {
        return Update_schedules;
    }

    public void setUpdate_schedules(boolean Update_schedules) {
        this.Update_schedules = Update_schedules;
    }

    public boolean isCancel() {
        return Cancel;
    }

    public void setCancel(boolean Cancel) {
        this.Cancel = Cancel;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public boolean isUpdate_fees() {
        return Update_fees;
    }

    public void setUpdate_fees(boolean Update_fees) {
        this.Update_fees = Update_fees;
    }

    public boolean isOrder_medical_supplier() {
        return Order_medical_supplier;
    }

    public void setOrder_medical_supplier(boolean Order_medical_supplier) {
        this.Order_medical_supplier = Order_medical_supplier;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

   
    @Override
    public int getAge() {
        return Age;
    }

    @Override
    public void setAge(int Age) {
        this.Age = Age;
    }

    @Override
    public String getAddress() {
        return Address;
    }

    @Override
    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + (this.full_time ? 1 : 0);
        hash = 47 * hash + (this.half_time ? 1 : 0);
        hash = 47 * hash + (this.Update_schedules ? 1 : 0);
        hash = 47 * hash + (this.Cancel ? 1 : 0);
        hash = 47 * hash + (this.Update_fees ? 1 : 0);
        hash = 47 * hash + (this.Order_medical_supplier ? 1 : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Doctors other = (Doctors) obj;
        if (this.full_time != other.full_time) {
            return false;
        }
        if (this.half_time != other.half_time) {
            return false;
        }
        if (this.Update_schedules != other.Update_schedules) {
            return false;
        }
        if (this.Cancel != other.Cancel) {
            return false;
        }
        if (this.Update_fees != other.Update_fees) {
            return false;
        }
        return this.Order_medical_supplier == other.Order_medical_supplier;
    }
    private static final Logger LOG = Logger.getLogger(Doctors.class.getName());

    @Override
    public String toString() {
        return "Doctors{" + "ID=" + ID + ", Name=" + Name + ", mail=" + mail + ", Specialization=" + Specialization + ", full_time=" + full_time + ", half_time=" + half_time + ", Update_schedules=" + Update_schedules + ", Cancel=" + Cancel + ", User_Name=" + User_Name + ", pass=" + pass + ", Update_fees=" + Update_fees + ", Order_medical_supplier=" + Order_medical_supplier + '}';
    }

   

     
    
    
    
    
    
    
    
    
}
