import java.util.Scanner;

public class PrintString {
    public static void main(String[] args) {
//        String name ;
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the String You want to ");
//        name = sc.nextLine();
//        System.out.println("This is U enter String "+name);
//        System.out.println("Length of Given String " + name.length());


        String str1  = "Hello World";
        System.out.println(str1);

        String str2  = "Hello Anudip";
        System.out.println(str2);

//        break string
        String str3 = str1.substring(0,5);
        System.out.println(str3);

        String str4 = str2.substring(5);
        System.out.println(str4);

//        concat string
        String  str5 = str3.concat(str4);
        System.out.println(str5);

//        indexof
        System.out.println( str5.indexOf("Anudip"));

//      get a double value and convert it into a string
        double y = 203.354d;
        String str6 = String.valueOf(y);
        System.out.println(str6);



//        split a string and check whether the second string is palindrom or not
        String str7[] = str1.split(" ");
        for(int i=0;i<str1.length;i++){
            System.out.println(str7[i]);
        }





    }
}

