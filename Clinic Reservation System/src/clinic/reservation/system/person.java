/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;
import java.util.Scanner;
/**
 *
 * @author Hp
 */
public class person {
    protected int id;
    protected String name;
    protected int Age;
    protected String Address;

    
    public person(int id, String name, int Age, String Address) {
        this.id = id;
        this.name = name;
        this.Age = Age;
        this.Address = Address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    @Override
    public String toString() {
        return "person{" + "id=" + id + ", name=" + name + ", Age=" + Age + ", Address=" + Address + '}';
    }
  
    
       
            
}
