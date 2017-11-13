import java.io.*;
import java.util.*;

public class DataValidation{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        
        System.out.println("First Name: ");
        String first = namer();
        
        System.out.println("Last Name: ");
        String last = namer();
        
        System.out.println("Zip code: ");
        String zip = zipper();
        
        System.out.println("Year of Birth (XXXX): ");
        String birth = alive();
        
        System.out.println("Phone Number (XXX-XXX-XXXX): ");
        String number = fakePhone();
        
        System.out.println("Email: ");
        String email = emailer(); //cant do nextLine() after nextDouble() or nextInt()
        
        System.out.println("Username: ");
        String username = reader.next();
        
        String password = passwordVeri();
        allAlpha(password);
        
        enterSystem(username, password);

        
        
        
        /*System.out.println(first);
        System.out.println(last);
        System.out.println(zip);
        System.out.println(birth);
        System.out.println(number);
        System.out.println(email);
        System.out.println(username);*/
    }
    
    public static void enterSystem(String username, String password){
        Scanner scan = new Scanner(System.in);
        String enteredPassword, enteredUsername;
        System.out.print("\n\n\n\n");
        while(true){
            System.out.println("Enter the username you created: ");
            enteredUsername = scan.next();
            if(!enteredUsername.equals(username)){
                System.out.println("That is not your username");
            } else{
                break;
            }
        }
        while(true){
            System.out.println("Enter the password you created: ");
            enteredPassword = scan.next();
            if(!enteredPassword.equals(password)){
                System.out.println("That is not your password");
            } else{
                break;
            }
        }
        
        System.out.println("\n CONGRATULATIONS! You have successfully signed up and entered the system. woop.");
    }
    
    public static String emailer(){
        Scanner scan = new Scanner(System.in);
        int atSigns, dotSigns;
        String email;
        boolean good;
        while(true){
            email = scan.next();
            atSigns = dotSigns = 0;
            for(int i=0; i<email.length(); i++){
                if(email.charAt(i) == '@'){
                    atSigns++;
                }else if(email.charAt(i) == '.'){
                    dotSigns++;
                }
            }
            if(atSigns == 1){
                
            }
            if(atSigns == 1 && dotSigns >= 1){
                break;
            } else {
                System.out.println("\tThat is not the correct format for an email address");
                System.out.println("Email: ");
            }
        }
        return email;
    }
    
    public static String fakePhone(){
        Scanner scan = new Scanner(System.in);
        String number = scan.next();
        boolean fake;
        int counter;
        while(true){
            counter = 0;
            fake = false;
            if(number.length() == 12){
                if(!Character.isDigit(number.charAt(0))){
                    fake = true;
                } else if(!Character.isDigit(number.charAt(1))){
                    fake = true;
                } else if(!Character.isDigit(number.charAt(2))){
                    fake = true;
                } else if(number.charAt(3) != '-'){
                    fake = true;
                } else if(!Character.isDigit(number.charAt(4))){
                    fake = true;
                } else if(!Character.isDigit(number.charAt(5))){
                    fake = true;
                } else if(!Character.isDigit(number.charAt(6))){
                    fake = true;
                } else if(number.charAt(7) != '-'){
                    fake = true;
                } else if(!Character.isDigit(number.charAt(8))){
                    fake = true;
                } else if(!Character.isDigit(number.charAt(9))){
                    fake = true;
                } else if(!Character.isDigit(number.charAt(10))){
                    fake = true;
                } else if(!Character.isDigit(number.charAt(11))){
                    fake = true;
                }  
            } else {
                fake = true;
            }
            if(fake == false){
                break;
            } else{
                System.out.println("\tFake phone number.");
                System.out.println("Phone Number (XXX-XXX-XXXX): ");
                number = scan.next();
            }
        }
    
        return number;
    }
    
    public static String birther(String birth){
        Scanner scan = new Scanner(System.in);
        while(isNumString(birth) == false && birth.length() != 4){
            System.out.println("\tYour birth year should have 4 digits");
            System.out.println("Year of Birth: ");
            birth = scan.next();
        }
        return birth;
    }
    
    public static String alive(){
        Scanner bdayReader = new Scanner(System.in);
        String date = bdayReader.next();
        String birth = birther(date);
        int year = Integer.parseInt(birth);
        while(year < 1900 || year > 2017){
            System.out.println("\tThat is not a realistic birthday");
            System.out.println("Year of Birth (XXXX):");
            birth = bdayReader.next();
            year = Integer.parseInt(birth);
        }
        return birth;
    }
    
    public static String zipper(){
        Scanner scan = new Scanner(System.in);
        String zip = scan.next();
        while(isNumString(zip) == false || zip.length() != 5){
            System.out.println("\tZip codes have 5 digits");
            System.out.println("Zip code: ");
            zip = scan.next();
        }
        return zip;
    }
    
    public static String namer(){
        Scanner nameReader = new Scanner(System.in);
        String name = nameReader.next();
        boolean nameLong,noDigits;
        while(true){
            nameLong = true;
            if(name.length() < 2){
                System.out.println("\tPlease type it out completely.");
                nameLong = false;
            }
            if(allAlpha(name) == false){
                System.out.println("\tYour name should only contain letters");
            }
            if(nameLong && allAlpha(name)){  
                break;
            } else{
                name = nameReader.next();
            }
        }
        return name;
    }
    
    public static boolean isNumString(String str){
        boolean num = true;

        for(int i=0; i < str.length()-1; i++){
            if(Character.isDigit(str.charAt(i)) == true){
                num = true;
            } else{
                num = false;
                break;
            }
        }
        return num;
    }
    
    public static boolean allAlpha(String str){
        boolean abc = true;

        for(int i=0; i < str.length(); i++){
            if(Character.isLetter(str.charAt(i)) == true){
                abc = true;
            } else{
                abc = false;
                break;
            }
        }
        return abc;
    }
    
    public static String passwordVeri(){
        String code, reenter;
        Scanner read = new Scanner(System.in);
        while(true){
            System.out.println("Password: ");
            code = read.next();
            if(code.length() >= 8 == false){
                System.out.println("\tYou need to have at least 8 characters");
                continue;
            }
            if(counter(code, "lower") == false|| counter(code, "upper") == false || counter(code, "digit") == false){
                if(counter(code, "lower") == false){
                    System.out.println("\tPassword needs at least one lower case letter");
                }
                if(counter(code, "upper") == false){
                    System.out.println("\tCode should have at least one upper case letter");
                }  
                if(counter(code, "digit") == false){
                    System.out.println("\tPassword has to have at least two digits");
                }
                continue;
            }
            System.out.println("Re-enter Password: ");
            reenter = read.next();
            if(code.equals(reenter)){
                break;
            } else{
                System.out.println("\tYour passwords do not match");
            }
        }
        return code;
    }
    
    public static boolean counter(String str, String type){
        int lower, upper, digits; 
        boolean length = false;
        lower = upper = digits = 0;
        for(int i=0; i<str.length(); i++){
            if(Character.isLetter(str.charAt(i))){
                if(Character.isLowerCase(str.charAt(i))){
                    lower++;
                } else{
                    upper++;
                }
            } else if(Character.isDigit(str.charAt(i))){
                digits++;
            }
        }
        if(type.equals("lower") && lower >= 1){
            length = true;
        } else if (type.equals("upper") && upper >= 1){
            length = true;
        } else if(type.equals("digit") && digits >= 2){
            length = true;
        }
        return length;
    }
}
