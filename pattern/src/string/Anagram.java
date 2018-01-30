package string;
import java.util.Arrays;
import java.util.Scanner; 
public class Anagram { 

 
 public static void main(String[] args)
 {
     Scanner sc= new Scanner(System.in);
     System.out.println("Enter the String1");
     String str1= sc.nextLine();
     System.out.println("Enter the String2");
     String str2= sc.nextLine();
     String s1 = str1.replaceAll("\\s", "");  
     String s2 = str2.replaceAll("\\s", "");  
     boolean status = true;  
     if (s1.length() != s2.length()) {  
         status = false;  
     } else {  
         char[] ArrayS1 = s1.toLowerCase().toCharArray();  
         char[] ArrayS2 = s2.toLowerCase().toCharArray();  
         Arrays.sort(ArrayS1);  
         Arrays.sort(ArrayS2);  
         status = Arrays.equals(ArrayS1, ArrayS2);  
     }  
     if (status) {  
         System.out.println(s1 + " and " + s2 + " are anagrams");  
     } else {  
         System.out.println(s1 + " and " + s2 + " are not anagrams");  
     }  
 }  
}  


	

	


