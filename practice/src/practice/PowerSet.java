package practice;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    public static List<String> findPowerSet(String str) {
        List<String> powerSet = new ArrayList<>();
        generatePowerSet(str, 0, "", powerSet);
        return powerSet;
    }
    
    private static void generatePowerSet(String str, int index, String current, List<String> powerSet) {
        if (index == str.length()) {
            powerSet.add(current);
            return;
        }
        
        // Exclude current character
        generatePowerSet(str, index + 1, current, powerSet);
        
        // Include current character
        generatePowerSet(str, index + 1, current + str.charAt(index), powerSet);
    }
    
    public static void main(String[] args) {
        String str = "abc";
        List<String> result = new ArrayList();
//        System.out.println("Power set of \"" + str + "\":");
//        for (String subset : result) {
//            System.out.println(subset);
//        }
        for(int i=0;i<str.length();i++) {
//        	System.out.println(String.valueOf(str.charAt(i)));
//        	if(String.valueOf(str.charAt(i))==null) {
//        		result.add("");
//        	}
        	result.add(String.valueOf(str.charAt(i)));
        }
        for(int i=0;i<str.length();i++) {
            for(int j=0;j<str.length();j++) {
            	result.add(String.valueOf(str.charAt(j)+""+str.charAt(i)));
            }
        }
        result.add("");
        result.add(str);
       
        for (String subset : result) {
            System.out.println(subset);
        }
    }
}
