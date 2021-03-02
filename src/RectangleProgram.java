import com.sun.jndi.ldap.sasl.SaslInputStream;

import java.util.Scanner;
public class RectangleProgram {
    public static void main(String[] args) {
        float width, height, area;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        width = scanner.nextFloat();
        System.out.println("Enter height: ");
        height = scanner.nextFloat();
        area = width * height;
        System.out.println("The area is: " + area);
    }
}
