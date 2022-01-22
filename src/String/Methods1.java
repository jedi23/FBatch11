package String;

public class Methods1
{

    public static void main(String[] args) {

     String device = "microphone";
     device.concat(" is an input device");
        System.out.println(device); // microphone

     char ch = device.charAt(1); // i
        System.out.println(ch);

     int letterCount = device.length(); // returns a number, 10 letters in microphone
        System.out.println(letterCount);
        device += " is expensive";
        System.out.println(device.length());  // 23 length (microphone is expensive)
        System.out.println(device);           // microphone is expensive

        device.concat(" device");
        System.out.println(device.length()); // still 23 because we have not reassigned device

        device =  device.concat(" device");
        System.out.println(device.length()); // 30 because device has been reassigned with concat
        System.out.println(device);          // microphone is expensive device

        // take last char from this last version of the String

        System.out.println(device.charAt(29)); // e

        String example = "I will be a Very Successful SDET!";
        // example.charAt(example.length()-1);
        char lastChar = example.charAt(example.length()-1);
        System.out.println(lastChar);

        String ex2 = "Thanksgiving was Fantasic! Great Quality Family Time! :)";
        int count = ex2.length();
        char lastLetter= ex2.charAt(count-1);
        System.out.println(lastLetter);
        // find the middle char from the last string

        String school = "Techtorial";
        System.out.println(school.charAt(school.length()/2));

       // System.out.println(school.charAt(15)); // exception, String index out of range: 15
        // since there is no 15th index, StringIndexOutOfBoundsException
    }
}
