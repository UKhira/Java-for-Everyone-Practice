import java.util.Scanner;

public class readNum {
    public static void main(String[] args) {
        boolean maintain = true;
        Scanner in = new Scanner(System.in);
        while (maintain){
            System.out.println("Enter c to continue any other key to quit");
            String input = in.next();
            if (input.toLowerCase().equals("c")) {
                System.out.println("Enter a number between 0 and 1000: ");
                if (in.hasNextInt()) {
                    int number = in.nextInt();
                    String num = Integer.toString(number);
                    int digit = num.length();
                    digitChecker(digit,number);
                }
                else {
                    System.out.println("Invalid input");
                }
                continue;
            }
            else {
                break;
            }
        }
        in.close();
    }

    public static void digitChecker(int digitCount,int numberInMain) {
       if (numberInMain >= 0) {
         if (digitCount == 1){
            oneToNine(numberInMain);
            System.out.println(oneToNine(numberInMain));
        }
        else if (digitCount == 2) {
            twoDigitChecker(numberInMain);
            System.out.println(twoDigitChecker(numberInMain));
        }
        else if (digitCount == 3) {
            threeDigitMethod(numberInMain);
            System.out.println(threeDigitMethod(numberInMain));
        }
        else {
            System.out.println("Enter a value between 1 and 1000");
        }
       }
       else {
        System.out.println("Number must be poitive");
       }
    }

    public static String oneToNine(int numberInMainfromChecker){
        String numberRead = "";
        switch(numberInMainfromChecker) {
            case 0 : numberRead = "Zero"; break;
            case 1 : numberRead = "One"; break;
            case 2 : numberRead = "Two"; break;
            case 3 : numberRead = "Three"; break;
            case 4 : numberRead = "Four"; break;
            case 5 : numberRead = "Five"; break;
            case 6 : numberRead = "Six"; break;
            case 7 : numberRead = "Seven"; break;
            case 8 : numberRead = "Eight"; break;
            case 9 : numberRead = "Nine"; break;
        }
        return numberRead;
    }

    public static String twoDigitChecker(int numberInMainfromChecker){
        String numberRead = "";
        int mod = numberInMainfromChecker % 10;
        // int div = numberInMainfromChecker / 10;
        if (mod == 0) {
            switch(numberInMainfromChecker) {
                case 10 : numberRead ="Ten"; break;
                case 20 : numberRead = "Twenty"; break;
                case 30 : numberRead = "Thirty"; break;
                case 40 : numberRead = "Fourty"; break;
                case 50 : numberRead = "Fifty"; break;
                case 60 : numberRead = "Sixty"; break;
                case 70 : numberRead = "Seventy"; break;
                case 80 : numberRead = "Eighty"; break;
                case 90 : numberRead = "Ninety"; break;
            }
        } 
        else {
            numberRead = ExceptionofTwoDigits(numberInMainfromChecker);
        }  
        return numberRead;
    }

    public static String ExceptionofTwoDigits(int num) {
        String numberRead = "";
        int mod = num % 10;
        int div = num / 10;
        if (div == 1) {
            if (num == 11) {
            numberRead = "Eleven";
            }
            else if (num == 12) {
                numberRead = "Twelve";
            }
            else if (num == 13) {
                numberRead = "Thirteen";
            }
            else if (num == 15) {
                numberRead = "Fifteen";
            }
            else if (num == 18) {
                numberRead = "Eighteen";
            }
            else {
                numberRead = oneToNine(mod) + "teen";
            }
        }
        else {
            numberRead = twoDigitChecker(div * 10) + " " + oneToNine(mod); 
        }
        return numberRead;
    }


    public static String threeDigitMethod(int number) {
        String prefix = "";
        int mod = number % 100;
        int div = number / 100;
        if (mod == 0) {
            if (number == 100){
                prefix = "Hundred";
            }
            else {
                prefix =  oneToNine(div) +" Hundred ";
            }
        }
        else {
            prefix =  oneToNine(div) +" Hundred and " + twoDigitChecker(mod);
        }
        return prefix;
    }
}
