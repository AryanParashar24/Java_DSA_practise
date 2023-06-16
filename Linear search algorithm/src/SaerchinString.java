import java.util.Arrays;

public class SaerchinString {
    public static void main(String[] args) {
        String name = "Aryan";
        char target = 'y';
        System.out.println(Arrays.toString(name.toCharArray()));
        //Just to create a character array and print it and then it will just iterate and for the char we r looknig for and will let us know if it had it or nt
        System.out.println(search(name, target));

    }

    static boolean search2(String str, char target){
        if (str.length() == 0){   // here the str.length in the length function wasn't having any () as it was variable and here in the string it is a function So here we gotta use that bracket over there
            return false;
        }

        for (char ch : str.toCharArray()){ //basically to use a ForEach function u have to have an array so thatswhy i converted string into array
            if (ch == target){
                return true;
            }
        }
        return false;
    }
    static boolean search(String str, char target){
        if (str.length() == 0){   // here the str.length in the length function wasn't having any () as it was variable and here in the string it is a function So here we gotta use that bracket over there
            return false;
        }

        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
