package Email_App;

import java.net.PasswordAuthentication;
import java.util.Scanner;

public class Email {

    private String firstName ;
    private String lastName ;
    private String passWord;
    private String departMent;
    private String email;
    private int mailboxCap= 400;
    private String alternativeMail;
    private String companySuffix= "company.com";


    //constructor to receive the first name and last name
    public  Email(String firstName, String lastName){

        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("email created "+ this.firstName + " " + this.lastName);

        this.departMent =setDepartment();
        System.out.println(this.departMent);

        //call a method that returns a random password

        this.passWord= randomPassword(8);
        System.out.println( "your password is " + this.passWord);
        // genrate email
        this.email= firstName.toLowerCase()+lastName.toLowerCase()+"."+departMent+"@"+companySuffix;
        System.out.println(email);



    }

    //ask for department name
    private  String setDepartment(){

        System.out.print("Enter department \n1 for sales \n2 for development \n3 for accounting\n0 for none :\n ");

        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        switch(num)
        {
            case 1 :
                return  "sales";
            case 2:
                return  "dev";
            case 3:
                return "acct";
                default:
                    return "";

        }


    }

    //generate a random password

    private String randomPassword (int length ){

    String setPassword="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%~";
    char [] password = new char[length];

        for (int i = 0; i <length ; i++) {

            int rand =(int) (Math.random() * setPassword.length());
            password[i]=setPassword.charAt(rand);

        }
        return new String(password);

    }

    //set the mailbox capacity
public  void changemailboxCap (int cap){
        this.mailboxCap = cap ;

}

    //set the alternative mail
    public  void setAlteremail (String mail){
        this.alternativeMail = mail;

    }

    //change the password

    public  void changePass(String passWord){


        this.passWord =passWord;
    }



    public  int getmailboxCap () { return mailboxCap;}
    public  String getPassWord(){return  passWord;}
    public  String getAlternativeMail () {return  alternativeMail;}
}
