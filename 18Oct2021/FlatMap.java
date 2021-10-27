import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMap {
    public static void main(String[] args) {
        
        List<String> employee  = Arrays.asList("Ankush Thakur", "Ajay", "Mohit");
        List<String> Stack = Arrays.asList("MERN", "MERN", "MEVN");
        List<String> leave = Arrays.asList("2 days", "4 days", "6 days");

        System.out.println(employee);
        System.out.println(Stack);
        System.out.println(leave);

        List<List<String>> employeeDetails = new ArrayList<>();

        employeeDetails.add(employee);
        employeeDetails.add(Stack);
        employeeDetails.add(leave);

        System.out.println(employeeDetails);

        List<String> flatMap = employeeDetails.stream().flatMap(clist -> clist.stream()).collect(Collectors.toList());
        System.out.println("FlatMap Now");
        System.out.println(flatMap);
    }
    
}

