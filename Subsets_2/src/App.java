import java.util.*;

public class App {
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        helper(res,new ArrayList<>(),nums,0);
        return res;
    }
    
    public void helper(List<List<Integer>> res, List<Integer> ls, int[] nums, int pos) {
        res.add(new ArrayList<>(ls));
        for(int i=pos;i<nums.length;i++) {
            if(i>pos&&nums[i]==nums[i-1]) continue;
            ls.add(nums[i]);
            helper(res,ls,nums,i+1);     
            ls.remove(ls.size()-1);
        }
    }
    
    public static void main(String[] args) throws Exception {
        App myApp = new App();
        int start[] = {1,2,2};
        List<List<Integer>> answer = myApp.subsetsWithDup(start);

        System.out.print(answer);
    }
}
