

package Queue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;



public class Employee {
    private int age;
    private String name;
    private float money;

    public Employee(int age, String name, float money) {
        this.age = age;
        this.name = name;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getMoney() {
        return money;
    }

    public void setMoney(float money) {
        this.money = money;
    }   

    @Override
    public String toString() {
        return "Employee{" + "age=" + age + ", name=" + name + ", money=" + money + '}';
    }
    
}
class NameCompara implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
class AgeCompara implements Comparator<Employee>{

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getAge() - o2.getAge();
    }
}
class Money implements  Comparator<Employee>
{

    @Override
    public int compare(Employee o1, Employee o2) {
        if(o1.getMoney()==o2.getMoney())  
return 0;  
else if(o1.getMoney()>o2.getMoney())  
return 1;  
else  
return -1;  
    }
}

class Test{
    
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<Employee>();
        list.add(new Employee(5, "Hieu", 1.3f));
        list.add(new Employee(6, "Nguyen", 1.2f));
        list.add(new Employee(7, "Ngoc", 1.4f));
        Collections.sort(list, new NameCompara());
        System.out.println(list);
        System.out.println("========");
        Collections.sort(list,new AgeCompara());
        System.out.println("++++++++");
        System.out.println(list);
        Collections.sort(list, new Money());
        System.out.println(list);
    } 
}