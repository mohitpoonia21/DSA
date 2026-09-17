class Solution {
    public void reverseString(char[] s) {

        int left = 0;
        int right = s.length -1;

        while(left<=right){ // jbb tk left right se chhota ya barabr h in place swapping krenge temp variable ka use krke temp k andr left char ko store krlenge fir left m right wale ko place krdenge abb left ki value lost nahi because alr temp m stored h islie right m abb temp ki value ko daal denge
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;

            left++; // left ko aage bdhaynge
            right--; // right ko picche krenge
        }
    }
}