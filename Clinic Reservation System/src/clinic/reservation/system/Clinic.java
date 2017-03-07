/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;
public class Clinic {
private int ID;
private  int Address;
private  int Number ;
private int About ;
private int Specilization;
private int X_ray_room;
    public void Id(int ClinicID)
    {
      this.ID=ClinicID;   
    }
    public void Address(int ClinicAddress)
    {
        this.Address=int ClinicAddress;
    }
    public void Number(int ClinicNumber)
    {
        this.Number=int ClinicNumber;
    }
    public void About(int ClinicAbout)
    {
        this.About=int ClinicAbout;
    }
    public void Specialization(int ClinicSpecialization)
    {
         this.Specialization=int ClinicSpeciaallization;
    }
    public void X_ray_room(int ClinicX_ray_room)
    {
        this.X_ray_room=int ClinicX_ray_room;
    }


}
