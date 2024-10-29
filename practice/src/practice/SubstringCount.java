package practice;

public class SubstringCount {

	public static void main(String[] args) {
		 String str = "aaaabbbaaa";
	        String arr[] = {"aaa", "bbb"};
	        int count[] = new int[arr.length];  // Array to store counts of each substring
	        System.out.println(str.length() - 3+" "+str.charAt(6));
	        for (int i = 0; i <= str.length() - 3; i++) {  // Loop to check substrings of length 3
	            // Check for "aaa"
	            boolean matchAaa = true;
	            for (int j = 0; j < 3; j++) {
	                if (str.charAt(i + j) != arr[0].charAt(j)) {
	                    matchAaa = false;
	                    break;
	                }
	            }
	            if (matchAaa) {
	                count[0]++;
	                i += 2;  // Skip next 2 characters since we already matched a 3-char substring
	                continue;
	            }

	            // Check for "bbb"
	            boolean matchBbb = true;
	            for (int j = 0; j < 3; j++) {
	                if (str.charAt(i + j) != arr[1].charAt(j)) {
	                    matchBbb = false;
	                    break;
	                }
	            }
	            if (matchBbb) {
	                count[1]++;
	                i += 2;  // Skip next 2 characters since we already matched a 3-char substring
	            }
	        }

	        System.out.println(arr[0] + "1," + arr[0] + "2," + arr[1] + "1," + arr[0] + "1");
	    }
	}
