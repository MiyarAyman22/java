/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;

import java.util.logging.Logger;

public class Clinic 
{
private int ID;
private  String Address;
private  int phone_Number ;
private String About ;
private String Specilization;
private boolean X_ray_room;

    public Clinic(int ID, String Address, int phone_Number, String About, String Specilization, boolean X_ray_room) {
        this.ID = ID;
        this.Address = Address;
        this.phone_Number = phone_Number;
        this.About = About;
        this.Specilization = Specilization;
        this.X_ray_room = X_ray_room;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public int getPhone_Number() {
        return phone_Number;
    }

    public void setPhone_Number(int phone_Number) {
        this.phone_Number = phone_Number;
    }

    public String getAbout() {
        return About;
    }

    public void setAbout(String About) {
        this.About = About;
    }

    public String getSpecilization() {
        return Specilization;
    }

    public void setSpecilization(String Specilization) {
        this.Specilization = Specilization;
    }

    public boolean isX_ray_room() {
        return X_ray_room;
    }

    public void setX_ray_room(boolean X_ray_room) {
        this.X_ray_room = X_ray_room;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + (this.X_ray_room ? 1 : 0);
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
        final Clinic other = (Clinic) obj;
        if (this.ID != other.ID) {
            return false;
        }
        if (this.X_ray_room != other.X_ray_room) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Clinic{" + "ID=" + ID + ", Address=" + Address + ", phone_Number=" + phone_Number + ", About=" + About + ", Specilization=" + Specilization + ", X_ray_room=" + X_ray_room + '}';
    }
    private static final Logger LOG = Logger.getLogger(Clinic.class.getName());
    

}
