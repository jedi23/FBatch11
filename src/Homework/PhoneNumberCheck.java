package Homework;

public class PhoneNumberCheck {

        // Create method here
        public boolean isValidPhone(String phoneNumber){
            if(phoneNumber.matches("[7-9]{1}[0-9]{2}[-]{1}[0-9]{3}[-]{1}[0-9]{4}")){
                return true;
            }else{
                return false;
            }
        }

    }     // why can't I run it!?
