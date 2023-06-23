package ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;



/**
 * 수를 입력받고, 중앙값 구하기
 * 1 5 3 5 => 4.0
 * 2 4 6 => 4
 * 1 4 7 3 5 8 5 3 => 4.5
 */
public class Median3 {

    public static void main(String[] args) throws IOException {
        //책 방법은 너무 머리아픔..
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer tokenizer = new StringTokenizer(br.readLine(), " ");
        br.close();

        int length = tokenizer.countTokens();
        int[] nums = new int[length];

        for (int i = 0; i < length; i++) {
            nums[i] = Integer.parseInt(tokenizer.nextToken());
        }

        //정렬부터 -> 정렬 메서드를 써도 될까?
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        int m = 0; double median = 0; // 구하고자하는 값 median을 최상단? 사용하는 근처?, 짝수인경우는 실수고 홀수인경우는 정수인데 어떻게 처리하지?
        if(length%2 ==0) {
            m = length/2;
            median =  (nums[m-1] + nums[m])/2.0;
        } else {
            m = (int)Math.floor(length / 2.0);
            median = nums[m];
        }

        System.out.println(median);

    }
}
