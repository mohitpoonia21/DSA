class Solution {
    public String reformatNumber(String number) {
        number = number.replace(" ","").replace("-","");

        String ans = "";
        int i = 0;
        int n = number.length();

        while(n-i>4){
            ans = ans + number.substring(i,i+3) + "-";
            i += 3;
        }

        if(n-i==4){
            ans = ans + number.substring(i,i+2)+"-"+number.substring(i+2);
        }
        else{
            ans = ans + number.substring(i);
        }

        return ans;

    }
}