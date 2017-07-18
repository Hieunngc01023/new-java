

package Queue;


import java.util.HashMap;
import java.util.Iterator;
 
public class Country {  
  
    String name;  
    long population;  
    public String getName() {  
        return name;  
    }  
    public void setName(String name) {  
        this.name = name;  
    }  
    public long getPopulation() {  
        return population;  
    }  
    public void setPopulation(long population) {  
        this.population = population;  
    }  

      @Override  
    public boolean equals(Object obj) {  
//        if (this == obj)  
//            return true;  
//        if (obj == null)  
//            return false;  
//        if (getClass() != obj.getClass())  
//            return false;  
//        Country other = (Country) obj;  
//        if (name == null) {  
//            if (other.name != null)  
//                return false;  
//        } else if (!name.equals(other.name))  
//            return false;  
//        return true;  
        Country coun = (Country) obj;
        return this.name == coun.getName();
    }
    @Override  
    public int hashCode() {  
        return this.getName().hashCode();
    }  


 
      
}  

 class HashMapEqualityCheckMain {  
  
    /** 
     * @author Arpit Mandliya 
     */  
    public static void main(String[] args) {  
        HashMap<Country,String> countryCapitalMap=new HashMap<Country,String>();   
        Country india1=new Country();  
        india1.setName("India");  
        Country india2=new Country();  
        india2.setName("India");  
  
        countryCapitalMap.put(india1, "Delhi");  
        countryCapitalMap.put(india2, "Delhi");  
  
        Iterator<Country> countryCapitalIter=countryCapitalMap.keySet().iterator();  
        while(countryCapitalIter.hasNext())  
        {  
            Country countryObj=countryCapitalIter.next();  
            String capital=countryCapitalMap.get(countryObj);  
            System.out.println("Capital of "+ countryObj.getName()+"----"+capital);  
  
        }  
    }   
}  

