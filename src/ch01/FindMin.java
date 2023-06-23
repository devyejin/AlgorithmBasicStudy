package ch01;

import java.io.BufferedReader; //java.io.* 보다 특정 클래스를 import 하는것이 효율적!
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1, 5, 6, 2    => 결과 1
 * 1, -6, 3, 7, 2, 5 => 결과 -6
 * -10, -6, 3, 7, 2, -20 => 결과 -20
 */
public class FindMin {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

         StringTokenizer tokenizer = new StringTokenizer(br.readLine(),", ");
         br.close();

         int count = tokenizer.countTokens();

         int[] nums = new int[count];

         for(int i =0; i<count; i++) {
             nums[i] = Integer.parseInt(tokenizer.nextToken());
         }

         int min = nums[0]; //0으로 초기화? 첫번째 값으로 초기화?
         for(int num : nums) { //1부터 시작하나 0부터 시작하나 속도에서 차이는 없을거같은데 -> 차이가 있다면 일반for문 1부터 시작으로
             if(num < min)
                 min = num;
         }

        System.out.println(min);

    }
}
