import java.util.*;
public class OTP {
    String password;
    String email;
    public OTP(String userEmail)
    {
        email=userEmail;
    }
    public boolean checkPass(String input)
    {
        if(password.equals(input))
        {
            return true;
        }
        else
        {
            System.out.println("Would you like to resend code?");
            return false;
        }
    }
    public String createOTP()
    {
        String oneTimeCode="";
        for(int i=0;i<6;i++)
        {
           oneTimeCode+= Integer.toString((int)(Math.random()*10));
        }
        return oneTimeCode;
    }
}
