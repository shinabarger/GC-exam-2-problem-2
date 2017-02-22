/**
 * Created by davidshinabarger on 2/22/17.
 */
public class Employee extends Main {

    String socialSecurityNum;
    float Salary;
    String name;

    public Employee(String name, String socialSecurityNum, float salary) {
        this.name = name;
        this.socialSecurityNum = socialSecurityNum;
        Salary = salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSocialSecurityNum() {
        return socialSecurityNum;
    }
    public void setSocialSecurityNum(String socialSecurityNum) {
        this.socialSecurityNum = socialSecurityNum;
    }
    public float getSalary() {
        return Salary;
    }
    public void setSalary(float salary) {
        Salary = salary;
    }

}
