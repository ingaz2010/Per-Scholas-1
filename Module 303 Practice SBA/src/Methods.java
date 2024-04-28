import java.util.Arrays;

public class Methods {

    public void randomizeList(String[] names){
        //Create a program that can randomize a list of names. Use only what has been
        // taught thus far. Your program should return the list of string in a random order.
        String[] randomNames = new String[names.length];

        for(int i = 0; i < names.length; i++){
            int newIndex = (int)(Math.random()*names.length);
            //System.out.println("Random number:" + newIndex);
            if(randomNames[newIndex] == null){
                randomNames[newIndex] = names[i];
            }else{
                while(randomNames[newIndex] != null){
                    newIndex = (int)(Math.random()*names.length);
                }
                randomNames[newIndex] = names[i];
            }
        }

        System.out.println(Arrays.toString(randomNames));

    }

    public void combination(){
        //Create a program that will output the total number of combinations for a password with a length
        //of 4 using only the numbers  1-4. You can repeat numbers but not the combination.
        //Do not show duplicate combinations.

        int numOfDigits = 4;
        String password= "";
        int countPasswords = 0;
        for(int j = 1; j <= numOfDigits; j++){
            for(int k = 1; k <= numOfDigits; k++){
                for(int l = 1; l <= numOfDigits; l++){
                    for(int m = 1; m <= numOfDigits; m++){
                        password = Integer.toString(j) + Integer.toString(k) + Integer.toString(l) + Integer.toString(m);
                        countPasswords++;
                        System.out.println(countPasswords +" : " + password);
                    }
                }
            }
        }
        System.out.println(countPasswords + " possible combinations");
    }

    public void stringArithmetic(String numbers){
        if(numbers.length() % 8 == 0){
            int numberOfRounds = numbers.length() / 8;
            for(int i = 0; i < numberOfRounds; i++) {
                int x = i*8;
                int a = Integer.parseInt(numbers.substring(x+0, x+1));
                int b = Integer.parseInt(numbers.substring(x+1, x+2));
                int subtractionPart = a - b;
                System.out.println(a + " - " + b + " = " + subtractionPart);

                a = Integer.parseInt(numbers.substring(x+2, x+3));
                b = Integer.parseInt(numbers.substring(x+3, x+4));
                double divisionPart = (double) a / b;
                String division = String.format("%.2f", divisionPart);
                System.out.println(a + " / " + b + " = " + division);

                a = Integer.parseInt(numbers.substring(x+4, x+5));
                b = Integer.parseInt(numbers.substring(x+5, x+6));
                int multiplyPart = a * b;
                System.out.println(a + " * " + b + " = " + multiplyPart);

                a = Integer.parseInt(numbers.substring(x+6, x+7));
                b = Integer.parseInt(numbers.substring(x+7, x+8));
                int addPart = a + b;
                System.out.println(a + " + " + b + " = " + addPart);
            }
        } else{
            System.out.println("Invalid String. The length of the String needs to be divisible by 8.");
        }
    }

    public void printing(String s){
        //Using the following classes ArraysLinks to an external site. , StringLinks
        // to an external site. and CharacterLinks to an external site. .
        // Create  3 methods that will print each individual  digit of a string.
        // You will use each class to create one method.

        //creates array of characters
        char[] arr = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            System.out.println("Number " + (i + 1) + " is " + arr[i]);
        }

        //prints string accessing each char at its position
        for(int i = 0; i < arr.length; i++){
            char ch = arr[i];
            System.out.println("Number " + (i + 1) + " is " + ch);
        }

        //string class
        for(int i = 0; i < arr.length; i++){
            String str = s.substring(i, i + 1);
            System.out.println("Number " + (i + 1) + " is " + str);
        }
    }

    public void division(String n){
        // Create a  method to divide the digits of a given string.
        int divisionResult = Integer.parseInt(n.substring(0, 1));
        for(int i = 1; i < n.length(); i++){
            System.out.println(divisionResult /= Integer.parseInt(n.substring(i, i + 1)));
        }
        System.out.println("Result for divided digits in the string: " + divisionResult);
    }

    public void subtraction(String n){
        //Create a  method to subtract the digits of a given string.
        int result = Integer.parseInt(n.substring(0, 1));
        for(int i = 1; i < n.length(); i++){
            System.out.println(result -= Integer.parseInt(n.substring(i, i + 1)));
        }
        System.out.println("Result: " + result);
    }
}
