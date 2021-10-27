import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        File fInput = new File(
                "‪C:\\Users\\Ankush Thakur\\Desktop\\input.txt");

        try {
            FileWriter fOutput = new FileWriter(
                "‪C:\\Users\\Ankush Thakur\\Desktop\\output.txt");
            Scanner sc = new Scanner(fInput);
            while (sc.hasNextLine()) {
                String val = sc.nextLine();
                int myNewVal = Integer.parseInt(val);
                if (myNewVal % 2 == 0) {
                    System.out.println(myNewVal);
                    String result = String.valueOf(myNewVal);  
                    fOutput.write(result + '\n');
                }
            }
            sc.close();
            fOutput.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("Some issue | Please contact developer.");
        }
    }
}
