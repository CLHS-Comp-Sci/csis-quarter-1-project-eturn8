import java.util.*;
public class OTPRunner {
    public static void main(String args[])
    {
        Scanner input=new Scanner(System.in);
        System.out.println("email:");
        String email=input.nextLine();
        OTP user1= new OTP(email);
//        System.out.println(user1.createOTP());
    }
}
