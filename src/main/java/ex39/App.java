package ex39;

import java.lang.reflect.Array;
import java.util.*;

public class App {
    public static void main(String[] args){

        ArrayList<Map<String, String[]>> employees = new ArrayList<Map<String, String[]>>();


        Map<String, String[]> data5 =
                new HashMap<String, String[]>();

        String[] jacquelyn_jackson = {"DBA", ""};
        data5.put("Jacquelyn Jackson", jacquelyn_jackson);

        employees.add(data5);

        Map<String, String[]> data4 =
                new HashMap<String, String[]>();

        String[] jake_jacobson = {"Programmer", ""};
        data4.put("Jake Jacobson", jake_jacobson);

        employees.add(data4);

        Map<String, String[]> data1 =
                new HashMap<String, String[]>();

        String[] john_johnson = {"Manager", "2016-12-31"};
        data1.put("John Johnson", john_johnson);

        employees.add(data1);

        Map<String, String[]> data3 =
                new HashMap<String, String[]>();

        String[] michaela_michaelson = {"District manager", "2015-12-19"};
        data3.put("Michaela Michaelson", michaela_michaelson);

        employees.add(data3);


        Map<String, String[]> data6 =
                new HashMap<String, String[]>();

        String[] sally_webber = {"Web Developer", "2015-12-18"};
        data6.put("Sally Webber", sally_webber);

        employees.add(data6);


        Map<String, String[]> data2 =
                new HashMap<String, String[]>();

        String[] tou_xiong = {"Software Engineer", "2016-10-05"};
        data2.put("Tou Xiong", tou_xiong);

        employees.add(data2);


        System.out.println("Results:\nName                | Position          | Separation Date");
        System.out.println("--------------------|-------------------|----------------");


        for(int i = 0; i < employees.size(); i++){
            for(Map.Entry<String, String[]> person : employees.get(i).entrySet()){
                System.out.println(person.getKey() + "\t\t| " + person.getValue()[0] + "\t\t\t| " + person.getValue()[1]);
            }
        }

    }
}