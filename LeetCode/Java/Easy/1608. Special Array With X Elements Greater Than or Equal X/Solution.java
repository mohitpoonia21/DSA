class Solution {
    public int specialArray(int[] nums) {
        int n = nums.length;
        for(int x =0;x<=n;x++){ // x ki har ek possible value 0 se n tk check krenge 
            int count = 0; // count ko har baar reset krenge
            for(int i = 0;i<n;i++){ // ek aur loop run krenge aur dekhenge kitne elements uss x ki value k barabr ya bade h
                if(nums[i]>=x){
                    count++;
                }
            }    
            if(count == x){ // agr jitne elements barabr ya bde h vo equal h uss x ki value k toh vo special value h toh uss x ko return krdenge
                return x;
            }   
        }       
        return -1; // agr koi special value nhi h toh -1 return krdenge as per our problem statement
    }
}
