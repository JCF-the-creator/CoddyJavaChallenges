package TwoSum;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {

        int nums[] = {2, 8, 7, 11, 15};
        int target = 19;

        int n1 = 0;
        int n2 = 0;

        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) { 
                    continue; 
                }

                n1 = nums[i];
                n2 = nums[j];

                if (n1 + n2 == target) {
                    answer.add(i);
                    answer.add(j);
                    break;
                }

            }

            if (n1 + n2 == target) {
                break;
            }

        }

        System.out.println(answer);
    }
}