package clinic.reservation.system;
import java.util.Scanner;
public class ClinicReservationSystem 
{

    
    public static void main(String[] args)
    {
        Doctors doc1;
        Doctors doc2;
        Doctors doc3;
        Doctors doc4;
        Doctors doc5;
        Doctors doc6;
        doc1=new Doctors();
        doc1.ID=2263372;
        doc1.name="Saher";
        doc1.Age=40;
        doc1.Specialization="Dentist";
        doc1.mail="saher123@yahoo.com";
        
        doc2=new Doctors();
        doc2.ID=467598;
        doc2.name="Hosney";
        doc2.Age=39;
        doc2.Specialization="psychologicalist";
        doc2.mail="hosneyshbah@yahoo.com";
        
        doc3=new Doctors();
        doc3.ID=998478;
        doc3.name="hamis";
        doc3.Age=43;
        doc3.Specialization="psychologicalist";
        doc3.mail="hamis55@yahoo.com";
        
        doc4=new Doctors();
        doc4.ID=4455633;
        doc4.name="Samira";
        doc4.Age=48;
        doc4.Specialization="Dentist";
        doc4.mail="samira11@yahoo.com";
        
        doc5=new Doctors();
        doc5.ID=6789378;
        doc5.name="julia";
        doc5.Age=47;
        doc5.Specialization="Dentist";
        doc5.mail="juila99@yahoo.com";
        
        doc6=new Doctors();
        doc6.ID=2263372;
        doc6.name="ibrahim";
        doc6.Age=50;
        doc6.Specialization="psychologicalist";
        doc6.mail="ibrahimhima22@yahoo.com";
        
        
        
        
        for (int i=1;i<7;i++)
        {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your user name: ");
        String User_Name=input.nextLine();
        System.out.println("Enter your pass: ");
        String pass=input.nextLine();
        
        }
        
        Manager mang1;
        mang1=new Manager(Name);
        mang1.Name="john";
        System.out.println("Name" +Name);
        mang1.Mail="john33@yahoo.com";
        System.out.println("Mail" +Mail);
        mang1.mobile_phone=1233;
        System.out.println("mobile_phone" +mobile_phone);
    
        Clinic clinic1;
        clinic1=new Clinic();
        clinic1.Address="londonstreet2";
        System.out.println("Address" +Address);
        clinic1.phone_Number=123445;
        System.out.println("phone_Number" +phone_Number);
        clinic1.About="clinic is open since 2003";
        System.out.println("About" +About);
        clinic1.Specilization="dentist,psychologicalist";
        System.out.println("Specilization" +Specilization);
        
        Admin_Staff staff1;
        staff1=new Admin_Staff();
        staff1.Id=789876;
        System.out.println("Id" +Id);
        staff1.Name="muhammed";
        System.out.println("Name" +Name);
        staff1.Mail="muhammed33@yahoo.com";
        System.out.println("mail" +mail);
        Admin_Staff staff2;
        staff2=new Admin_Staff();
        staff2.Id=123456;
        System.out.println("Id" +Id);
        staff2.Name="ahmed";
        System.out.println("Name" +Name);
        staff2.mail="ahmed44@yahoo.com";
        System.out.println("mail" +mail);
   
        Clinic_Owner owner;
        owner=new Clinic_owner();
        owner.Name="khaled";
        System.out.println("Name" +Name);
   
        owner.mail="khaled567@yahoo.com";
        System.out.println("mail" +mail);
   
        owner.Address="nasercity@egypt";
        System.out.println("Address" +Address);
   
        owner.Mobile_phone=12344;
        
        Patient patient1;
        patient1=new Patient();
        patient1.Id=65468;
        System.out.println("Id" +Id);
        patient1.Address="ismailia";
        System.out.println("Address" +Address);
        patient1.age=23;
        System.out.println("age" +age);
        patient1.Mobile_phone=9999987;
        System.out.println("Mobile_phone" +Mobile_phone);
        patient1.Gender='G';
        System.out.println("Gender" +Gender);
        patient1.Blood_type='A';
        System.out.println("Blood_type" +Blood_type);
        
        Patient patient2;
        patient2=new Patient();
        patient2.Id=56398;
        System.out.println("Id" +Id);
        patient2.Address="Rehab";
        System.out.println("Address" +Address);
        patient2.age=26;
        System.out.println("age" +age);
        patient2.Mobile_phone=9995387;
        System.out.println("Mobile_phone" +Mobile_phone);
        patient2.Gender='B';
        System.out.println("Gender" +Gender);
        patient2.Blood_type='O';
        System.out.println("Blood_type" +Blood_type);
        
        Patient patient3;
        patient3=new Patient();
        patient3.Id=88745632;
        System.out.println("Id" +Id);
        patient1.Address="Hurghada";
        System.out.println("Address" +Address);
        patient1.age=30;
        System.out.println("age" +age);
        patient1.Mobile_phone=9922987;
        System.out.println("Mobile_phone" +Mobile_phone);
        patient1.Gender='B';
        System.out.println("Gender" +Gender);
        patient1.Blood_type='B';
        System.out.println("Blood_type" +Blood_type);
        
    
                
        for (int j=1;j<7;j++)
        {
        Scanner input=new Scanner (System.in);
        System.out.println("Enter your user name: ");
        String User_Name=input.nextLine();
        System.out.println("Enter your pass: ");
        String pass=input.nextLine();
        
        }
                
        
        
    }
    
}
