import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class EmployeeDA
{
    private HashMap<String, Employee> empMap;

    // Getter and Setter for empMap
    public HashMap<String, Employee> getEmpMap() {
        return empMap;
    }

    public void setEmpMap(HashMap<String, Employee> empMap) {
        this.empMap = empMap;
    }

    public EmployeeDA(String depCode, String empNo, String salary) throws FileNotFoundException
    {
        //System.out.println(empNo + "thisempNo");
        
        try
        {
            Scanner employeeFile = new Scanner(new FileReader("emp.csv"));
            empMap = new HashMap<String, Employee>();

            Integer key = 0;

            while(employeeFile.hasNext())
            {
                String rowEmp = new String();
                rowEmp = employeeFile.nextLine();
                String [] rowEmpSplit = new String[4];
                rowEmpSplit = rowEmp.split(",");

               // System.out.println(rowEmpSplit[0].trim() + "this split");
               
                if(empNo.equals(rowEmpSplit[0].trim()))
                {
                    
                    Employee employee = new Employee();
                    //System.out.println(rowEmpSplit[1]);
                    employee.setEmpNo(rowEmpSplit[0].trim());
                    employee.setLastName(rowEmpSplit[1].trim());
                    employee.setFirstName(rowEmpSplit[2].trim());
                    employee.setSalary(Double.parseDouble(salary));
                    
                    System.out.println();

                    empMap.put(empNo + key, employee);
                    key++;
                }
            
               // System.out.println(empNo + " " + rowEmpSplit[0] + employee.getEmpNo());
                
                


            }



        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}