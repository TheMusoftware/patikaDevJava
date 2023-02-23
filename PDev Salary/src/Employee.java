import java.time.LocalDate;
public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    Employee(String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    double tax(){
        double taxRatio = 0;
        if(salary>=1000) taxRatio = 0.03;
        return salary*taxRatio;
    }
    double bonus(){
        double addition = 0.0;
        if(workHours>40){
            addition += (workHours-40)*30;
        }
        return addition;
    }
    double raiseSalary(){
        double raiseRatio = 0;
        int worksYear = LocalDate.now().getYear() - hireYear;
        if(worksYear<10) raiseRatio = 0.05;
        else if(worksYear>9 && worksYear<20) raiseRatio = 0.1;
        else raiseRatio = 0.15;
        return raiseRatio*salary;
    }
    void showInfo(){
        double newSalary = raiseSalary()+bonus()-tax()+this.salary;
        System.out.printf("Name: %s%n",this.name);
        System.out.printf("Salary: %.2f%n",this.salary);
        System.out.printf("Working Hours: %d%n",this.workHours);
        System.out.printf("Starting Year: %d%n",this.hireYear);
        System.out.printf("Tax: %.2f%n",tax());
        System.out.printf("Bonus: %.1f%n",bonus());
        System.out.printf("Raising amount: %.2f%n",raiseSalary());
        System.out.printf("Net Salary (After Tax Bonus and etc.): %.2f",newSalary);
    }
}
