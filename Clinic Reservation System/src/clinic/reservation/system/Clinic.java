/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;

public class Clinic 
{
private int ID;
private  String Address;
private  int Number ;
private String About ;
private String Specilization;
private String X_ray_room;
    public void Id(int ClinicID)
    {
      this.ID=ClinicID;   
    }
    public void Address(String ClinicAddress)
    {
        this.Address=ClinicAddress;
    }
    public void Number(int ClinicNumber)
    {
        this.Number=ClinicNumber;
    }
    public void About(String ClinicAbout)
    {
        this.About=ClinicAbout;
    }
    public void Specialization(String ClinicSpecialization)
    {
         this.Specialization=ClinicSpeciaallization;
    }
    public void X_ray_room(int ClinicX_ray_room)
    {
        this.X_ray_room=ClinicX_ray_room;
    }


}
