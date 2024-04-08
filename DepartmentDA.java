import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class DepartmentDA
{
    private HashMap<String, Employee> empMap;

    public DepartmentDA() throws FileNotFoundException
    {
        try
        {
            Scanner departmentFile = new Scanner(new FileReader("dep.csv"));
            Integer key = 0;
            ArrayList<Double> salaryList = new ArrayList<>();
            
            while(departmentFile.hasNext())
            {
                empMap = new HashMap<>();
                String rowDep = new String();
                rowDep = departmentFile.nextLine();
                String [] rowDepSplit = new String[3];
                rowDepSplit = rowDep.split(",");

                Department department = new Department();

                department.setDepCode(rowDepSplit[0].trim());
                department.setDepName(rowDepSplit[1].trim());
                              
                //System.out.println("Department code: " + department.getDepCode());
                //System.out.println("Department name: " + department.getDepName());

                
                //EmployeeDA employeeDA = new EmployeeDA(department.getDepCode());

                //department.setEmpMap(employeeDA.getEmpMap());

                

                Scanner deptEmpFile = new Scanner(new FileReader("deptemp.csv"));

                
                System.out.println("Department code: " + department.getDepCode());
                System.out.println("Department name: " + department.getDepName());
                //System.out.println("Department total salary: " + salaryList + "\n");
                System.out.println();
                System.out.println("---------------------Details -------------------------\n");

                Double totalSalary = 0.0;
                Double salaries = 0.0;
                while(deptEmpFile.hasNext())
                 {
                     //empMap = new HashMap<>();
     
                     String rowDept = new String();
                     rowDept = deptEmpFile.nextLine();
                     String [] rowDeptSplit = new String [3];
                     rowDeptSplit = rowDept.split(",");
     
                     //Department department = new Department();
                     //System.out.println(department.getDepCode()+ "thisdepcode");
                     if(department.getDepCode().equals(rowDeptSplit[0]))
                     {
                        EmployeeDA employeeDA = new EmployeeDA(rowDeptSplit[0].trim(),rowDeptSplit[1].trim(), rowDeptSplit[2].trim());
                        salaryList.add(Double.parseDouble(rowDeptSplit[2]));
                     department.setEmpMap(employeeDA.getEmpMap());

                     
                     
                     
                     
                     for(Map.Entry<String, Employee> empMap : department.getEmpMap().entrySet())
                        {
                            String empNo = empMap.getValue().getEmpNo();
                            String fullName = empMap.getValue().getLastName() + ", " + empMap.getValue().getFirstName();
                            Double salary = empMap.getValue().getSalary();

                            totalSalary += empMap.getValue().getSalary();

                            // Format and print the employee details
                            System.out.printf("%-8s%-24s%.2f%n", empNo, fullName, salary);
                            System.out.println();
                        }
                        
                     



                     /*if(department.getDepCode().equals(rowDeptSplit[0]))
                     {
                        employee.setEmpNo(rowDeptSplit[1].trim());
                        employee.setSalary(Double.parseDouble(rowDeptSplit[2].trim()));       
                     }
                     
                     empMap.put(employee.getEmpNo() + key, employee);
                     key++;*/
                 
     
                     
     
                     //System.out.println(empNo);
                     
                     /*EmployeeDA employeeDA = new EmployeeDA(employee.getEmpNo());
                     employee.getFirstName();
                     System.out.println(employee.getFirstName() + "firstname");
                     empMap = employeeDA.getEmpMap();
     
                     department.setEmpMap(empMap);
     
     
                     department.setEmpMap(employeeDA.getEmpMap());*/
                 
             
     
                 /*for(Map.Entry<String, Employee> empMap : department.getEmpMap().entrySet())
                 {
                     if(empMap.getValue().getEmpNo() != null)
                     {
                         System.out.println("Department code: " + department.getDepCode());
                         System.out.println("Department name: " + department.getDepName());
                         System.out.println("Department total salary: ");
                         
                     }
                     
                 }*/
                 
                 
                 
                 //System.out.println(department.getEmpMap().entrySet());
                 
                        //System.out.println("it went hereee");
                        
                        //System.out.println("WORKKK");
                        
                    
                   
                 }

            }
            System.out.println("Department total salary: " + totalSalary);
            System.out.println("\n\n");
                 }
                 
                

           
            
           

        }
        catch(FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }
    }
}