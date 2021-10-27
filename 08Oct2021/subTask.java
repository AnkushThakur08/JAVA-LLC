
import java.io.FileWriter;
import java.util.Scanner;

public class subTask {
    private String Name;
    private String Email;
    private String phone;

    public subTask(String name, String email, String phone) {
        this.Name = name;
        this.Email = email;
        this.phone = phone;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }
    public String getEmail() {
        return Email;
    }
    public void setEmail(String email) {
        this.Email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String toString(){  
        return "Employee Name is " + Name +" Employee Email is "+ Email +" Employee Phone no is "+ phone;
       }  
}

 class Emp{

    public static void main(String[] args) {
        
        subTask emp1 = new subTask("Ankush", "Ankush@test.com", "99999");
        subTask emp2 = new subTask("Anshika", "Anshika@gmail.com", "888888");

        System.out.println(emp1);
        System.out.println(emp2);


        System.out.println("Last Part of task");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String nm = sc.next();

        System.out.println("Enter Email: ");
        String em = sc.next();

        System.out.println("Enter Phone: ");
        String ph = sc.next();

        subTask us3 = new subTask(nm, em, ph);
        String st = us3.toString();
        System.out.println(us3);

        try {
            FileWriter fw = new FileWriter("C:\\Users\\Ankush Thakur\\Desktop\\sample.txt");
            fw.write(st);
            fw.close();
        } catch (Exception e) {
            System.out.println("Please Contact Developer");
        }
    }
}
