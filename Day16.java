import java.util.regex.*;
class Solution {
    public String validIPAddress(String IP) {
        String ipv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        String i4 = "^(" + ipv4 + "\\.){3}" + ipv4 + "$";        
        Pattern p4 = Pattern.compile(i4);
        Matcher m4 = p4.matcher(IP);
        
        String ipv6 = "([a-fA-F0-9]{1,4})";
        String i6 = "^(" + ipv6 + "\\:){7}" + ipv6 + "$";        
        Pattern p6 = Pattern.compile(i6);
        Matcher m6 = p6.matcher(IP);
            
        if(m4.matches()) return "IPv4";
        
        if(m6.matches()) return "IPv6";
        
        return "Neither";
    }    
}
/*
Topic           : Regular Expressions
Time complexity : O(1)
Space complexity: O(1)
Useful link     : https://leetcode.com/articles/validate-ip-address/
*/
