

package collection.ArrayList.LearnArraylist;

import java.util.ArrayList;


public class TimetoArrayList {
    public static void main(String[] args) {
        String [] namesArray = new String[1000];
        long starttime = System.currentTimeMillis();
        for(int i =0; i<namesArray.length;i++)
            namesArray[i] ="Name" +i;
        long endTime = System.currentTimeMillis();
        System.out.println("Time taken by Array" +(endTime- starttime));
        ArrayList<String> nameList = new ArrayList<String>();
        long startimeList = System.currentTimeMillis();
        for(int i =0 ;i<=1000;i++)
        {
            nameList.add("Name" +i);
        }
        long endTimeList = System.currentTimeMillis();
        System.out.println("Time taken by ArrayList: "+(endTimeList - startimeList));
       int i =0;
        long timestart2 = System.currentTimeMillis();
        for(String name : namesArray)
        {
            name ="name"+i;
          
            
        }
       
        long timeend = System.currentTimeMillis();
        System.out.println("time take by foreach:  " +(timeend - timestart2)+ " ms");
    }
}
