/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;


public class Patient {
    private int Id;
    private String Name;
    private String Address;
    private int Age;
    private int Mobile_phone;
    private char Blood_type;
    private boolean chonic_Diseases;
public void Id(int PatientId)
{
    this.Id=PatientId;
}
public void Name(String PatientName)
{
    this.Name=PatientName;
}
public void Address(String PatientAddress)
{
this.Address=PatientAddress;
}
public void Age(int PatientAge)
{
    this.Age=PatientAge;
}
public void Mobile_phone(int PatientMobile_phone)
{
    this.Mobile_phone=PatientMobile_phone;
}
public void Blood_type(char PatientBlood_type)
{
    this.Blood_type=PatientBlood_type;
}
public void chonic_Diseases(boolean Patientchonic_Diseases)
{
    this.chonic_Diseases=Patientchonic_Diseases;
}






}
