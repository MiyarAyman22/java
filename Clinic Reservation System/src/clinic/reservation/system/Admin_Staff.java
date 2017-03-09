/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clinic.reservation.system;

public class Admin_Staff {
    private int Id;
    private String Mail;
    private String Nurses;
    private String Reception;
    private String clinician;
    private String Maintaining_supplies;
    private String IT;
    private String Accountant;
            
    
    public void Id(int Admin_StaffId )
    {
        this.Id=Admin_StaffId;
    }
    public void Mail(String Admin_StaffMail)
    {
        this.Mail= Admin_StaffMail;
    }
    public void Nurses(String Admin_StaffNurses)
    {
        this.Nurses=Admin_StaffNurses;
    }
    public void Reception(String Admin_StaffReception)
    {
        this.Reception=Admin_StaffReception;
    }
    public void  clinician(String Admin_Staffclinician)
    {
        this.clinician=Admin_Staffclinician;
    }
    public void Maintaining_supplies(String Admin_StaffMaintaining_supplies)
    {
        this.Maintaining_supplies=Admin_StaffMaintaining_supplies;
    }
    public void IT(String Admin_StaffIT )
    {
        this.IT=Admin_StaffIT;
    }
    public void Accountant(String Admin_StaffAccountant)
    {
        this.Accountant=Admin_StaffAccountant;
    }
    
}
