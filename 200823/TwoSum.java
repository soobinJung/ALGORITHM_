import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		
		int[] nums = {2, 8, 11, 21};
		int target = 10;
		
		TwoSum a = new TwoSum();
		
		int[] result = a.solve(nums,target);
		for( int i : result) {
			System.out.println(i);
		}
	}
	
	public int[] solve( int[] nums, int taget ) {
		
		// ´ãÀ» ±×¸©
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];
		
		//		int[] nums = {2, 8, 11, 21};
		for( int i=0; i < nums.length; i++) {
			if( map.containsKey(nums[i])) {
				int mapValue = map.get(nums[i]);
				
				result[0] =  mapValue+1;
			    result[1] = i+1;
			    		
			}else {
				map.put(taget-nums[i], i);
			}
		}
		return result;
	}
}
