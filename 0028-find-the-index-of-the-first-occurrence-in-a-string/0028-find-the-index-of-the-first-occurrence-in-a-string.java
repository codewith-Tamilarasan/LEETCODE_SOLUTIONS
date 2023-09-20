class Solution {
    public int strStr(String a, String b) {
        int c = -1; 
        boolean flag = true;

        for (int i = 0; i <= a.length() - b.length(); i++) {
            String out = a.substring(i, i + b.length());
            flag = true;
            if (out.equals(b)) {
                flag = false;
                c = i;
                break;
            }
        }

        if (a.length() == 0 && b.length() == 0) {
            return 0; 
        }

        if (flag) {
            return -1;
        }
        return c;
    }
}




