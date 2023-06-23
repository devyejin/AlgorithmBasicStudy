package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1 5 6 2    => 결과 6
 * 1 6 3 7 2 5 => 결과 7
 */

public class FindMax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine()," ");
        br.close();

        int count = tokenizer.countTokens();

        int max=0;
        int[] nums = new int[count];

        for(int i=0; i<count; i++) {
            nums[i] = Integer.parseInt(tokenizer.nextToken());
        }

        max = nums[0];

        for(int num : nums) {
            if(num > max)
                max = num;
        }

        System.out.println(max);


    }
}
