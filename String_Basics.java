package javabasics;

public class String_Basics {
    public static void main(String[] args) {
        /*
        * concatenate-->str1.concat(str2)
        * length-->str.length()
        * trim --> str.trim()
        * upper case-->str.toUpperCase
        * lower case-->str.toLowerCase
        * empty  -->str.isEmpty()
        * */
        String str1 = "Sukrit";
        String str2 = "Dutta";
        String str3 = str1 + " " + str2;
        String str4 = str1.concat(str2);
        System.out.println(str3 +"\n"+str4);
        // java sees ' + ' as a concatenating operator if  one of them is a string
        int num1 = 100;
        System.out.println(str1 + " " + num1);
        //Gives the length of the String
        System.out.println(str2.length());

        //It will trim the the spaces from both the ends
        String str5 = "    all is well    ";
        System.out.println(str5);
        System.out.println(str5.trim());

        // uppercase
        System.out.println(str3.toUpperCase());
        //lowercase
        System.out.println(str3.toLowerCase());


        String str6 = "";
        System.out.println(str6.isEmpty());
    }
}
