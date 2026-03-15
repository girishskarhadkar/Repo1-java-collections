import java.util.ArrayList;
import java.util.List;

public class Driver {

    static void main(String [] args){
        List<Employee> empl = new ArrayList<>(10);
        empl.add( new Employee(1,"girish",100.00));
        empl.add( new Employee(2,"rahul",200.00));
        empl.add( new Employee(5,"neeraj",140.00));
        empl.add( new Employee(7,"rajesh",500.00));
        for(Employee e: empl){
            System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getSal());
        }
        empl.add(1, new Employee(4, "Aditya", 300.00));
        System.out.println("After adding employee at index 1");
        for(Employee e: empl){
            System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getSal());
        }
        empl.set(3, new Employee(50, "Neeraj1", 600.80));
        System.out.println("After setting new employee at index 3");
        for(Employee e: empl){
            System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getSal());
        }
        Employee zz = new Employee(50,"Neeraj1",600.80);
        System.out.println(empl.contains(zz));
        if(empl.contains(zz)){
            empl.remove(zz);
        }
        System.out.println("After removing employee at index 3");
        for(Employee e: empl){
            System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getSal());
        }


    }
}
