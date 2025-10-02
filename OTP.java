package com.eastern.EmailSender;
public class OTP {
    private static String pass;
    public static boolean checkPass(String input)
    {
        if(pass.equals(input))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static String createOTP()
    {
        String oneTimeCode="";
        for(int i=0;i<6;i++)
        {
           oneTimeCode+= Integer.toString((int)(Math.random()*10));
        }
        pass=oneTimeCode;
        return oneTimeCode;
    }
}
