/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;
import java.util.Scanner;
import java.util.logging.Logger;


public class Patient extends person {
    protected int Id;
    protected String Name;
    protected String User_Name;
    protected String address;
    protected int age;
    protected int Mobile_phone;
    protected char Blood_type;
    protected boolean chonic_Diseases;
    protected char Gender;
    protected  boolean Update;
    protected  boolean Cancel;
    protected String pass;

    public Patient(int Id, String Name, String User_Name, String address, int age, int Mobile_phone, char Blood_type, boolean chonic_Diseases, char Gender, boolean Update, boolean Cancel, String pass, int id, String name, int Age, String Address) {
        super(id, name, Age, Address);
        this.Id = Id;
        this.Name = Name;
        this.User_Name = User_Name;
        this.address = address;
        this.age = age;
        this.Mobile_phone = Mobile_phone;
        this.Blood_type = Blood_type;
        this.chonic_Diseases = chonic_Diseases;
        this.Gender = Gender;
        this.Update = Update;
        this.Cancel = Cancel;
        this.pass = pass;
    }

    Patient() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   

    @Override
    public int getId() {
        return Id;
    }

    @Override
    public void setId(int Id) {
        this.Id = Id;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName(String Name) {
        this.Name = Name;
    }

    public String getUser_Name() {
        return User_Name;
    }

    public void setUser_Name(String User_Name) {
        this.User_Name = User_Name;
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public int getMobile_phone() {
        return Mobile_phone;
    }

    public void setMobile_phone(int Mobile_phone) {
        this.Mobile_phone = Mobile_phone;
    }

    public char getBlood_type() {
        return Blood_type;
    }

    public void setBlood_type(char Blood_type) {
        this.Blood_type = Blood_type;
    }

    public boolean isChonic_Diseases() {
        return chonic_Diseases;
    }

    public void setChonic_Diseases(boolean chonic_Diseases) {
        this.chonic_Diseases = chonic_Diseases;
    }

    public char getGender() {
        return Gender;
    }

    public void setGender(char Gender) {
        this.Gender = Gender;
    }

    public boolean isUpdate() {
        return Update;
    }

    public void setUpdate(boolean Update) {
        this.Update = Update;
    }

    public boolean isCancel() {
        return Cancel;
    }

    public void setCancel(boolean Cancel) {
        this.Cancel = Cancel;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + (this.chonic_Diseases ? 1 : 0);
        hash = 37 * hash + (this.Update ? 1 : 0);
        hash = 37 * hash + (this.Cancel ? 1 : 0);
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
        final Patient other = (Patient) obj;
        if (this.chonic_Diseases != other.chonic_Diseases) {
            return false;
        }
        if (this.Update != other.Update) {
            return false;
        }
        if (this.Cancel != other.Cancel) {
            return false;
        }
        return true;
    }
    private static final Logger LOG = Logger.getLogger(Patient.class.getName());

    @Override
    public String toString() {
        return "Patient{" + "Id=" + Id + ", Name=" + Name + ", User_Name=" + User_Name + ", address=" + address + ", age=" + age + ", Mobile_phone=" + Mobile_phone + ", Blood_type=" + Blood_type + ", chonic_Diseases=" + chonic_Diseases + ", Gender=" + Gender + ", Update=" + Update + ", Cancel=" + Cancel + ", pass=" + pass + '}';
    }

   

    





}
