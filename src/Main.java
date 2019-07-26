

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        Scanner in = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = in.nextLine();
        // System.out.print(str);
        char[] charArray = str.toCharArray();
      //  System.out.println(str.charAt(0));
      //  System.out.println(str.charAt(1));
      //  System.out.println(str.charAt(2));
      //  char[] charArray = str.toCharArray();
     //   charArray = new char[3];

        char a = charArray[0];
        char b = charArray[2];

        // c использованием метода getNumericValue
        // класса Character
        int a1 = Character.getNumericValue(a);
        int b1 = Character.getNumericValue(b);

       // System.out.println(a1);
       // System.out.println(b1);

     //   int a = (int)charArray[0];
      //  int b = (int)charArray[2];
        char c = charArray[1];

     //    c = '+';
        int i = (int)c;
     //   System.out.println("i: " + i  );
if(i == 42){
   int  sum = a1 * b1;
    System.out.println(sum);

}
        if(i == 43){
            int  sum = a1 + b1;
            System.out.println(sum);

        }
        if(i == 45){
            int  sum = a1 - b1;
            System.out.println(sum);

        }
        if(i == 47){
            int  sum = a1 / b1;
            System.out.println(sum);

        }


      //  System.out.println(a);
      //  System.out.println(i);
      //  System.out.println(b);
      //  if (charArray[1] = "+") {
       //     int sum = a + b;
       //     System.out.println(sum);
            //  System.out.println(charArray [1] );
            //  System.out.println(charArray [2] );
        }
    }

