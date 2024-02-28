import java.util.*;

class userdefinedexception extends Exception {
    public String toString() {
        return ("HelloException");
    }
}

class UsrDefException {
    public static void main(String args[]) {
        String str;
        Scanner s = new Scanner(System.in);

        try {
            System.out.print("Enter name : ");
            str = s.next().trim();

            if(str.equalsIgnoreCase("HELLO")) {
                throw new userdefinedexception();
            } else {
                System.out.print("Hello " + str);
            }
        } catch(userdefinedexception e) {
            System.out.println(e.toString());
        }
    }
}
