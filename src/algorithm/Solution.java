package algorithm;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution = new Solution();
		System.out.println(solution.countDigitOne(110));
	
	}
	

    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
    	return result;
    }
    public boolean isPowerOfTwo(int n) {
        while (n % 2 == 0 && n != 0) {
        	n /= 2;
        }
        return n == 1 ? true : false;
    }
    public int countDigitOne(int n) {
    	int originN = n;
    	int wei = 1;
    	int m;
    	int l = 1;
    	int sum = 0;
    	while (n >= 10) {
    		m = n % 10 == 0 ? n / 10 : (int)(n / 10) + 1;
    		n /= 10;
    		sum += m * l;
    		l *= 10;
    		wei++;
        }
    	if (n > 0 && n < 10) {
    		if (n != 1) 
    			sum += l;
    		else if (n == 1) {
    			sum += originN - l + 1;
    		}
    	}
    	return sum;
    }
}
