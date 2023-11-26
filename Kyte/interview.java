import java.util.HashMap;

class interview {
    public static void main(String args[]) {
        System.out.println(checkI("drivekyte", "kyttttte"));
    }

    public static boolean checkB(String s1, String s2) {
        if(s2.length() > s1.length()) {
            return false;
        }
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        int j = 0;
        for(int i = 0; i < c1.length; i++) {
            if(c1[i] == c2[j]){
                if(j==c2.length-1) return true;
                else j++;
            } else{
                j = 0;
            }
        }
        return false;
    }

    public static int checkI(String s1, String s2) {
        // Optimal Solution - Comment or uncomment line to switch solutions
        // /*
        HashMap<Character, Integer> map1 = new HashMap<Character, Integer>();
        HashMap<Character, Integer> map2 = new HashMap<Character, Integer>();
        char[] cArr1 = s1.toCharArray();
        char[] cArr2 = s2.toCharArray();
        int count;
        // Mapping each string to how many times each character occurs
        for(char c : cArr1){
            count = 0;
            if(map1.containsKey(c))
                count = map1.get(c);
            map1.put(c, count+1);
        }
        for(char c : cArr2){
            // If map1 (string1), doesn't contain a character in string2, we can never make string2, return 0
            if(!map1.containsKey(c)) return 0;
            count = 0;
            if(map2.containsKey(c))
                count = map2.get(c);
            map2.put(c, count+1);
        }

        // Finding max
        int max = map2.get(cArr2[0]);
        char cMax = cArr2[0];
        char c;
        for(int i = 1; i < cArr2.length; i++){
            c = cArr2[i];
            if(map2.get(c) > max) {
                max = map2.get(c);
                cMax = c;
            }
        }

        // Dividing logic
        return max % map1.get(cMax) == 0? max / map1.get(cMax) : max / map1.get(cMax) + 1;
    }
        //*/

        // My solution - Comment or uncomment line to switch solutions
        /*
        String c1;
        int counter = 0;
        int length = s2.length();
        while(!s2.isEmpty())
        {
            for(int i = 0; i < s1.length(); i++) {
                c1 = Character.toString(s1.charAt(i));
                if(checkB(s2, c1)) {
                    s2 = alterString(s2, c1);
                }
            }
            if(s2.length() == length) {
                return counter;
            }
            length = s2.length();
            counter++;
        }
        return counter;
    }

    public static String alterString(String s, String c) {
        char cString = c.charAt(0);
        for(int i = 0; i< s.length(); i++) {
            if(s.charAt(i) == cString) {
                return s.substring(0, i) + s.substring(i + 1);
            }
        }
        return s;
    }
//*/
} 

