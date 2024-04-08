import java.util.HashMap;

public class Department
{
    private String depCode;
    private String depName;
    private Double depTotalSalary;
    private HashMap<String, Employee> empMap;

    // Getter and Setter for depCode
    public String getDepCode() {
        return depCode;
    }

    public void setDepCode(String depCode) {
        this.depCode = depCode;
    }

    // Getter and Setter for depName
    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    // Getter and Setter for depTotalSalary
    public Double getDepTotalSalary() {
    
        return depTotalSalary;
    }

    public void setDepTotalSalary(Double depTotalSalary) {
        this.depTotalSalary = depTotalSalary;
    }

    // Getter and Setter for empMap
    public HashMap<String, Employee> getEmpMap() {
        return empMap;
    }

    public void setEmpMap(HashMap<String, Employee> empMap) {
        this.empMap = empMap;
    }

}