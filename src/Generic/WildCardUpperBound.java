

package Generic;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
// Bài toán mô tả việc sử dụng wild card trong upper bound.
// Chỉ được sử dụng tỏng phương thức và được bao bọc trong collection
class Function
{
    public static <T extends Company> void show(List<T> list){
         ListIterator li = list.listIterator();
             while(li.hasNext())
             {
                 System.out.println(li.next());
             }
    }
    
}

public class WildCardUpperBound {
    public static void main(String[] args) {
        List<Employee> listemp = new ArrayList<>();
        listemp.add(new Employee("hieu", "ke toan"));
        listemp.add(new Employee("tung", "thu ngan"));
        listemp.add(new Employee("trung", "bao ve"));
        List<Deparment> listDepa = new ArrayList<>();
        listDepa.add(new Deparment("ke toan"));
        
        listDepa.add(new Deparment("thu ngan"));
        Function.show(listemp);
        System.out.println("=========");
        Function.show(listDepa);
        List<Company> listCom = new  ArrayList<Company>() {};
        Function.show(listCom);
    }
}
class Company{ 
  
}
class Employee extends Company{
    private String name;
    private String Department;

    public Employee(String name, String Department) {
        this.name = name;
        this.Department = Department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String Department) {
        this.Department = Department;
    }

    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", Department=" + Department + '}';
    }
    
}
class Deparment extends Company{
    private String  name;

    public Deparment(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Deparment{" + "name=" + name + '}';
    }
    
}