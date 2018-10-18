import java.util.Scanner;

public class Person {
        public static void main (String[]args) {
            Scanner input = new Scanner(System.in);
            {
                System.out.print("Enter full name: ");
                String name = input.nextLine();
                Person p= new Person(name);
                System.out.println("Full name is " + p.getFullName());
            }
        }
        public String getFullName;
        Person (String name) {
            this.getFullName = name;
        }
        String getFullName() {
            return getFullName;
        }
}
