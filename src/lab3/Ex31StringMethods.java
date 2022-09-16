package lab3;
import java.util.Arrays;

public class Ex31StringMethods {

    public static void main(String[] args) {
        String s1 = "Welcome to Java";
        String s2 = s1;
        String s3 = new String("Welcome to Java");
        String s4 = s1.intern();
        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);
        System.out.println("s3 : " + s3);
        System.out.println("s4 : " + s4);

        System.out.print("1. s1 == s2 : ");
        System.out.println(s1 == s2);
        System.out.print("2. s1 == s3 : ");
        System.out.println(s1 == s3);
        System.out.print("3. s1.equals(s2) : ");
        System.out.println(s1.equals(s2));
        System.out.println("4. s2.equals(s3) : " + s2.equals(s3));
        System.out.println("5. s1.compareTo(s2) : " + s1.compareTo(s2));
        System.out.println("6 .s2.compareTo(s3) : " + s2.compareTo(s3));
        System.out.println("7. s1 == s4 : " + (s1 == s4));
        System.out.println("8. s1.charAt(0) : " + s1.charAt(0));
        System.out.println("9. s1.indexOf('j') : " + s1.indexOf('j'));
        System.out.println("10. s1.indexOf(\"to\") " + s1.indexOf("to"));
        System.out.println("11. s1.lastIndexOf('a') : " + s1.lastIndexOf('a'));
        System.out.println("12. s1.lastIndexOf(\"o\",15) : " + s1.lastIndexOf("o",15));
        System.out.println("13. s1.length() " + s1.length());
        System.out.println("14. s1.substring(5) " + s1.substring(5));
        System.out.println("15. s1.substring(5,11) " + s1.substring(5,11));
        System.out.println("16. s1.startsWith(\"Wel\")" + s1.startsWith("Wel"));
        System.out.println("17. s1.endsWith(\"Java\") : " + s1.endsWith("Java"));
        System.out.println("18. s1.toLowerCase() : " + s1.toLowerCase());
        System.out.println("19. s1.toUpperCase() : " + s1.toUpperCase());
        System.out.println("20. \"  Welcome \".trim() : " + "  Welcome ".trim() );
        System.out.println("21. s1.replace('o','T') : " +  s1.replace('o','T'));
        System.out.println("22. s1.replaceAll('o','T') : " +  s1.replaceAll("o","T"));
        System.out.println("23 s.toCharArray() : " + Arrays.toString(s1.toCharArray()));
    }
}
